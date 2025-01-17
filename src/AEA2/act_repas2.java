package AEA2;

import java.sql.SQLOutput;
import java.util.*;

public class act_repas2 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System .in);
        Random random = new Random();

        System.out.println("Quàntes columnes vols a la matriu? ");
        int columnes = lector.nextInt();

        int[][] matriu = new int[5][columnes];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = random.nextInt(11);
            }
        }

        //Imprimir matriu
        System.out.println("Matriu Generada: ");
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
    }
}