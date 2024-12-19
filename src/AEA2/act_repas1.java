package AEA2;

import java.util.*;
public class act_repas1 {
    public static void main(String[] args) {
        Random random = new Random();

        int matriu[][]= new int[5][5];        //Matriu de 5 files i 5 columnes

        double sum=0;
        int num_max= 0;
        int num_min= 0;
        double sum_diago = 0;
        int length= matriu.length;
        int cont_parells= 0;
        int cont_senars= 0;

        //Omplim la matriu amb numeros random
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = random.nextInt(11);
                sum = sum + matriu[i][j];
            }
        }

        double mitjana = sum / length;      //Mitjana
        double sum_final = matriu[4][0] + matriu[4][1] + matriu[4][2] + matriu[4][3] + matriu[4][4]; //Suma última fila

        //Escriu les files(i) i les columnes(j) de la matriu
        System.out.println("Matriu generada:");
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
                if (matriu[i][j] > num_max){        //Num màxim de la matriu
                    num_max = matriu[i][j];
                }
                if (matriu[i][j] < num_min){        //Num mínim de la matriu
                    num_min= matriu[i][j];
                }
                if (i == j){        //Diagonal
                    sum_diago = sum_diago + matriu[i][j];
                }
                if (i %2==0 || j%2==0){
                    cont_parells = cont_parells ++;
                }
                else {
                    cont_senars = cont_senars ++;
                }
            }
            System.out.println();
        }

        // Contar freqüència
        int[] frequencia = new int[11]; // De 0 a 10
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                frequencia[matriu[i][j]]++;
            }
        }

        System.out.println("La mitjana és: " + mitjana);
        System.out.println("El número més petit és el: " + num_min);
        System.out.println("El número més gran és el: " + matriu[5][5]);
        System.out.println("La suma de la  diagonal és: " + sum_diago);
        System.out.println("La suma de la última fila: " + sum_final);
        System.out.println("Hi ha " + cont_parells + " números parells en la matriu");
        System.out.println("Hi ha " + cont_senars + " números senars en la matriu");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Número " + num_max + ": " + frequencia[i] + " vegades");
        }

    }
}