package AEA2;

import java.util.*;
public class act_repas1 {
    public static void main(String[] args) {
        Random random = new Random();

        double matriu[][]= new double[5][5];        //Matriu de 5 files i 5 columnes
        Arrays.sort(matriu);

        double sum=0;
        int sum_diago1 = 0;
        int sum_diago2 = 0;
        int j = 0;
        int length= matriu.length;

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = random.nextInt(11);
                sum = sum + matriu[i][j];
            }
        }
        double mitjana = sum / length;      //Mitjana
        double sum_final = matriu[5][0] + matriu[5][1] + matriu[5][2] + matriu[5][3] + matriu[5][4] + matriu[5][5]; //Suma última fila

        System.out.println("Matriu generada:");     //Escriu les files(i) i les columnes(j) de la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
                if (i == j){        //Diagonal primaria (1)
                    sum_diago1 = sum_diago1 + matriu[i][j];
                }
            }
            System.out.println();
        }
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.print("");
        }
        j = 2;
        for (int i = 0; i <= 5; i++) {
            sum_diago2= sum_diago2 + matriu[i][j];
            j--;
        }

        System.out.println("La mitjana és: " + mitjana);
        System.out.println("El número més petit és el: " + matriu[0][0]);
        System.out.println("El número més gran és el: " + matriu[5][5]);
        System.out.println("La suma de la primera diagonal és: " + sum_diago1);
        System.out.println("La suma de la última fila: " + sum_final);

    }
}