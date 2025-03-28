package AEA3.Mastermind;

import java.util.Random;

public class CodeGenerator {
    private static String ABC = "abcdefghijklmnopqrstuvwxyz";
    private static int CODE_LENGTH = 3;

    public String generateCode() {
        Random random = new Random();
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < CODE_LENGTH; i++) {
            code.append(ABC.charAt(random.nextInt(ABC.length())));
        }
        return code.toString();
    }
}