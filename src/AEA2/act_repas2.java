package AEA2;

import java.util.*;

public class act_repas2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Introdueix quàntes columnes vols: ");
        int columnes = lector.nextInt();

        int[][] matriu = new int[5][columnes];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = random.nextInt(11);  //Que el valor de la matriu sigui random
            }
        }

        System.out.println("Matriu generada:");     //Escriu les files i les columnes de la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
    }
}