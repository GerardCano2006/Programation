package AEA3.Mastermind;

import java.util.Random;
import java.util.HashSet;

public class Robot_Player extends Player {
    private Random random = new Random();
    private String lastGuess = "";
    private boolean hasWon = false;
    private HashSet<Character> incorrectChars = new HashSet<>();
    private char[] currentGuess;
    private char[] finalAnswer; // Letras confirmadas
    private HashSet<Character> misplacedChars = new HashSet<>(); // Letras que deben recolocarse

    public Robot_Player(int codeLength) {
        super(codeLength);
        currentGuess = new char[codeLength];
        finalAnswer = new char[codeLength];
        for (int i = 0; i < codeLength; i++) {
            finalAnswer[i] = '_'; // Inicializamos la respuesta final con '_'
        }
    }

    @Override
    public String makeGuess() {
        if (hasWon) return lastGuess; // Si ya ha ganado, no genera más intentos

        generateInitialGuess(); // Genera el primer intento si es necesario
        lastGuess = new String(currentGuess);
        return lastGuess;
    }

    public void updateGuess(String feedback) {
        if (feedback.equals("000") || feedback.equals("00000")) {
            hasWon = true; // Ha ganado si todo es '0'
            return;
        }

        char[] newGuess = lastGuess.toCharArray();
        HashSet<Integer> availablePositions = new HashSet<>();
        HashSet<Character> usedChars = new HashSet<>();

        for (int i = 0; i < feedback.length(); i++) {
            char currentChar = lastGuess.charAt(i);

            if (feedback.charAt(i) == '0') {
                // '0' → La letra está bien en su sitio, la dejamos y la guardamos en la respuesta final
                finalAnswer[i] = currentChar;
                usedChars.add(currentChar);
            } else if (feedback.charAt(i) == 'X') {
                // 'X' → Guardamos la letra como "mal posicionada" y liberamos la posición
                misplacedChars.add(currentChar);
                availablePositions.add(i);
            } else if (feedback.charAt(i) == '-') {
                // '-' → La letra no está en la palabra, no la volvemos a probar
                incorrectChars.add(currentChar);
                newGuess[i] = getNewUnusedChar(usedChars);
                usedChars.add(newGuess[i]);
            }
        }

        // Intentar recolocar letras mal posicionadas ('X')
        for (char misplaced : misplacedChars) {
            if (!availablePositions.isEmpty()) {
                int newPos = availablePositions.iterator().next();
                newGuess[newPos] = misplaced;
                availablePositions.remove(newPos);
            }
        }

        // Asegurar que las letras confirmadas ('0') se mantengan en su lugar
        for (int i = 0; i < getCodeLength(); i++) {
            if (finalAnswer[i] != '_') {
                newGuess[i] = finalAnswer[i];
            }
        }

        lastGuess = new String(newGuess);
    }

    private void generateInitialGuess() {
        HashSet<Character> usedChars = new HashSet<>();
        for (int i = 0; i < getCodeLength(); i++) {
            char newChar = getNewUnusedChar(usedChars);
            currentGuess[i] = newChar;
            usedChars.add(newChar);
        }
    }

    private char getNewUnusedChar(HashSet<Character> usedChars) {
        char newChar;
        do {
            newChar = (char) ('a' + random.nextInt(26));
        } while (usedChars.contains(newChar) || incorrectChars.contains(newChar));
        return newChar;
    }
}