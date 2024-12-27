package AEA2;

import java.util.*;

public class act_repas1 {
    public static void main(String[] args) {
        Random random = new Random();

        int matriu[][] = new int[5][5];  // Matriu de 5 files i 5 columnes

        int mitjana = 0;
        int sum = 0;
        int max = 0;
        int parells = 0;
        int senars = 0;
        int sum_diago1 = 0;
        int maxCount = 0;

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = random.nextInt(11);
                if (matriu[i][j] > max) {       //Número més gran
                    max = matriu[i][j];
                    maxCount = 1; // Si hi ha un nou valor més gran, restarteja el comptador a 1 aparició.
                } else if (matriu[i][j] == max) {
                    maxCount++; // Incrementar el comptador si es torna a aparèixer el número màxim.
                }
                sum = sum + matriu[i][j];

                if (matriu[i][j] % 2 == 0) { // Si el número es parell
                    parells = matriu[i][j];
                    System.out.println(parells + " És un número parell que apareix en la matriu!");
                } else {                    // Si el número es senar
                    senars = matriu[i][j];
                    System.out.println(senars + " És un número senar que apareix en la matriu!");
                }

                // Sumar la primera diagonal
                if (i == j) {
                    sum_diago1 = sum_diago1 + matriu[i][j];
                }
            }
        }

        // Calcular la mitjana de la matriu
        mitjana = sum / 25;

        // Mostrar la matriu
        System.out.println("Matriu generada:");
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println("");
        }

        // Mostrar els resultats
        System.out.println("La mitjana de la matriu és: " + mitjana);
        System.out.println("El número més gran de la taula és el: " + max);
        System.out.println("El número més gran és: " + max + " i apareix " + maxCount + " vegades.");
        System.out.println("La suma de la primera diagonal és: " + sum_diago1);
    }
}