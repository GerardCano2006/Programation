package AEA3;

import java.util.*;

public class funcions_2 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System .in);
        boolean fi = false;

        while (!fi) {
            System.out.println(" ");
            System.out.println("Quin caràcter vols escriure? ");
            String valor = lector.nextLine();

            System.out.println(" ");
            System.out.println("Quàntes vegades vols escriurel? ? ");
            int quantitat = lector.nextInt();

            if (quantitat != 0) {
                //Cridem la funció perque imprimeixi el resultat
                dibuixar_char(valor, quantitat);
            }
            else {
                fi = true;
            }
        }
    }

    public static void dibuixar_char(String valor, int quantitat){
        for (int i = 0; i < quantitat; i++) {
            System.out.print(valor);
        }
    }
}