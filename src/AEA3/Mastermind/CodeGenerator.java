package AEA3.Mastermind;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class CodeGenerator {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private Random random = new Random();

    public String generateCode(int length) {
        ArrayList<Character> availableLetters = new ArrayList<>();
        for (char c : ALPHABET.toCharArray()) {
            availableLetters.add(c);
        }
        Collections.shuffle(availableLetters, random);  // Mezclamos las letras

        StringBuilder code = new StringBuilder();
        for (int i = 0; i < length; i++) {
            code.append(availableLetters.get(i));  // Tomamos las primeras 'length' letras
        }
        return code.toString();
    }
}