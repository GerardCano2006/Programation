package AEA2;

import java.util.*;

public class act_repas5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Demanar el tamany de la matriu
        System.out.print("De quantes files vols la matriu?: ");
        int files = lector.nextInt();

        System.out.print("De quantes columnes vols la matriu? ");
        int columnes = lector.nextInt();

        int[][] matriu = new int[files][columnes];

        System.out.println("Introdueix els valors de la matriu (0 - 10):");
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                int num = 0;
                do {
                    System.out.print("Posició: " + i + " " + j + " ");
                    num = lector.nextInt();
                    if (num < 0 || num > 10) {
                        System.out.println("Num incorrecte, ha de ser entre 0 i 10");
                    }
                } while (num < 0 || num > 10);
                matriu[i][j] = num;
            }
        }

        // Comptar freqüència
        int frequencia[] = new int[11]; // De 0 a 10
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                frequencia[matriu[i][j]]++;
            }
        }

        // Mostrar freqüències
        for (int i = 0; i <= 10; i++) {
            System.out.println("Número " + i + ": " + frequencia[i] + " vegades");
        }
    }
}
