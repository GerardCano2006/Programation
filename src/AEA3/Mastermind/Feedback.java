package AEA3.Mastermind;

public class Feedback {
    public static final char TOT_CORRECTE = '0';
    public static final char MALA_POSICIO = 'X';
    public static final char INCORRECTE = '-';

    public String getFeedback(String secret, String guess) {        //Comprova si el feedback (la resposta del jugador) és correcta
        StringBuilder feedback = new StringBuilder();

        for (int i = 0; i < secret.length(); i++) {
            char secretChar = secret.charAt(i);
            char guessChar = guess.charAt(i);

            if (guessChar == secretChar) {      //Si la resposta és igual al codi secret
                feedback.append(TOT_CORRECTE);
            }
            else if (secret.indexOf(guessChar) != -1) {     //Si l'element està en el "secretChar" però no en aquella posició
                feedback.append(MALA_POSICIO);
            }
            else {      //Bàsicament, si l'element NO està en el "secretChar"
                feedback.append(INCORRECTE);
            }
        }
        return feedback.toString();
    }
}