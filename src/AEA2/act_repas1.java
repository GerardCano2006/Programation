package AEA2;

import java.util.*;

public class act_repas1 {
    public static void main(String[] args) {
        Random random = new Random();

        int matriu[][] = new int[5][5];  // Matriu de 5 files i 5 columnes
        int sum = 0;
        int max = 0;
        int comptador_max = 0;
        int sum_diago = 0;
        int sum_ultima_f = 0;

        int parells[][] = new int[5][5];
        int senars[][] = new int[5][5];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = random.nextInt(101);
                if (matriu[i][j] %2==0){        //És parell
                    parells[i][j] = matriu[i][j];
                }
                else {        //És senar
                    senars[i][j] = matriu[i][j];
                }


                sum = sum + matriu[i][j];
                if (matriu[i][j] > max) {       //Num max
                    max = matriu[i][j];
                    comptador_max = 0;
                    comptador_max ++;
                }
                else if (matriu[i][j] == max) { //Si el num max es repeteix
                    comptador_max ++;
                }

                if (i == j) {       //Suma de la diagonal
                    sum_diago = sum_diago + matriu[i][j];
                }
            }
        }
        sum_ultima_f = (matriu[4][0] + matriu[4][1] + matriu[4][2] + matriu[4][3] + matriu[4][4]);      //Sum última fila

        int mitjana = sum/25;




        //Matriu generada
        System.out.println("Matriu generada:");
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("La mitjana de la matriu és: " + mitjana);
        System.out.println("El número més gran que apareix en la matriu és el " + max + " i apareix " + comptador_max + " vegades");
        System.out.println("La suma de la diagonal de la matriu és: " + sum_diago);
        System.out.println("La suma de la última fila de la matriu és: " + sum_ultima_f);

        System.out.println("Els números parells de la matriu: " );      //Matriu números parells
        for (int i = 0; i < parells.length; i++) {
            for (int j = 0; j < parells[i].length; j++) {
                System.out.print(parells[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("Els números senars de la matriu: " );       //Matriu números senars
        for (int i = 0; i < senars.length; i++) {
            for (int j = 0; j < senars[i].length; j++) {
                System.out.print(senars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
    }
}