package AEA3.Mastermind;

import java.util.*;

public class Robot_Player extends Player {
    private Random random = new Random();
    private String lastGuess = " ";
    private boolean hasWon = false;

    private Map<Character, Character> charStatus = new HashMap<>();
    private char[] currentGuess;
    private char[] finalAnswer;

    public Robot_Player(int codeLength) {
        super(codeLength);
        currentGuess = new char[codeLength];
        finalAnswer = new char[codeLength];
        Arrays.fill(finalAnswer, '_');
    }

    @Override
    public String makeGuess() {
        if (hasWon) return lastGuess;

        HashSet<Character> usedChars = new HashSet<>(charStatus.keySet());

        for (int i = 0; i < getCodeLength(); i++) {
            if (finalAnswer[i] != '_') {
                currentGuess[i] = finalAnswer[i]; //Lletra confirmada (el feedback No és igual a "-")
                continue;
            }

            //Si tenim lletres mal colocades
            Character xChar = getCharWithStatus('X', usedChars);
            if (xChar != null) {
                currentGuess[i] = xChar;
                usedChars.add(xChar);
                continue;
            }

            //Buscar lletra no utilitzada ni descartada
            char newChar = getNewUnusedChar(usedChars);
            currentGuess[i] = newChar;
            usedChars.add(newChar);
        }

        lastGuess = new String(currentGuess);
        return lastGuess;
    }

    public void updateGuess(String feedback) {
        if (feedback.equals("000") || feedback.equals("00000")) {       //Si el feedback és "000" o "00000" ha guanyat
            hasWon = true;
            return;
        }

        for (int i = 0; i < feedback.length(); i++) {
            char guessedChar = lastGuess.charAt(i);
            char fb = feedback.charAt(i);

            switch (fb) {
                case '0':
                    charStatus.put(guessedChar, '0');
                    finalAnswer[i] = guessedChar; //Lletra correecta
                    break;
                case 'X':
                    if (charStatus.getOrDefault(guessedChar, '-') != '0') {
                        charStatus.put(guessedChar, 'X'); //Lletra en posició incorrecta
                    }
                    break;
                case '-':
                    if (!charStatus.containsKey(guessedChar)) {
                        charStatus.put(guessedChar, '-'); //Lletra NO correcta (NO utilitzar)
                    }
                    break;
            }
        }
    }

    private Character getCharWithStatus(char status, Set<Character> usedChars) {
        for (Map.Entry<Character, Character> entry : charStatus.entrySet()) {
            if (entry.getValue() == status && !usedChars.contains(entry.getKey())) {
                return entry.getKey();
            }
        }
        return null;
    }

    private char getNewUnusedChar(Set<Character> usedChars) {
        char newChar;
        do {
            newChar = (char) ('a' + random.nextInt(26));
        } while (usedChars.contains(newChar) || charStatus.getOrDefault(newChar, 'X') == '-');
        return newChar;
    }
}