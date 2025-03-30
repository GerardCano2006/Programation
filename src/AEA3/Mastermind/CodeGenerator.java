package AEA3.Mastermind;

import java.util.Random;

public class CodeGenerator {
    private static String ABC = "abcdefghijklmnopqrstuvwxyz";
    private static int CODE_LENGTH = 3;

    public String generateCode() {      //Genera el còdi
        Random random = new Random();
        StringBuilder codi = new StringBuilder();
        for (int i = 0; i < CODE_LENGTH; i++) {
            codi.append(ABC.charAt(random.nextInt(ABC.length())));      //Genera un còdi aleatori de 3 dígits entre tots els elements d'"ABC"
        }
        return codi.toString();
    }
}