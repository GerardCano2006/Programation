package AEA2;

import java.sql.SQLOutput;
import java.util.*;

public class act_repas1 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System .in);

        System.out.println("Nº files");
        int files = lector.nextInt();
        System.out.println("Nº columnes");
        int columnes = lector.nextInt();

        int sum = 0;
        int mitjana = 0;
        int sum_diago1 = 0;
        int sum_diago2 = 0;
        int sum_ulti_fila = 0;

        int[][] matriu = new int[files][columnes];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.println("Quin valor vols que hi hagi en la posició " + i + " " + j);
                int valor = lector.nextInt();

                if (valor < 0 ||valor > 10) {
                    System.out.println("ERROR, el valor ha de ser entre 0 i 10!!");
                    System.out.println("Quin valor vols que hi hagi en la posició " + i + " " + j);
                    valor = lector.nextInt();
                    matriu[i][j] = valor;
                    sum = sum + valor;
                }
                else {
                    matriu[i][j] = valor;
                    sum = sum + valor;
                }

                //Diago 1
                if (i == j) {
                    sum_diago1 = sum_diago1 + matriu[i][j];
                }
            }
        }

        //Diago 2
        for (int i = 0; i < matriu.length; i++) {
            sum_diago2 = sum_diago2 +  matriu[i][matriu.length - 1 - i];
        }

        mitjana = sum / (files + columnes);

        for (int j = 0; j < matriu[files - 1].length; j++) {
            sum_ulti_fila = sum_ulti_fila + matriu[files - 1][j];
        }

        System.out.println("Matriu Generada:");
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
        System.out.println(mitjana);
        System.out.println(sum_ulti_fila);
        System.out.println(sum_diago1);
    }
}