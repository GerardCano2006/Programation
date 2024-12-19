package AEA3;

import java.util.*;

public class funcions_2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean fi = false;
        System.out.println("SI VOLS PARAR, RECORDA D'ESCRIURE 0 EN EL NÚMERO DE VEGADES! ");

        while (!fi){
            System.out.println("Quin caràcter vols escriure? ");
            String valor = lector.next();

            System.out.println("Quantes vegades vols imprimi-lo? ");
            int quantitat = lector.nextInt();

            if (quantitat != 0){
                // Cridem a la funció perque imprimeixi el resultat
                Imprimir_caract(valor, quantitat);
            }
            else {
                fi = true;
            }
        }
    }

    public static void Imprimir_caract(String valor, int quantitat) {
        for (int i = 0; i < quantitat; i++) {
            System.out.println(valor);
        }
    }
}