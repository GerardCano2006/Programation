package AEA2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class act_repas3 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System .in);
        int sum = 0;
        int mitjana = 0;
        int sum_ulti_fila = 0;
        int sum_prim_fila = 0;
        int sum_prim_column = 0;
        int sum_ulti_column = 0;

        //Matriu 1

        System.out.println("De quàntes files vols a la primera matriu? ");
        int files = lector.nextInt();
        System.out.println("De quàntes files vols a la primera matriu? ");
        int columnes = lector.nextInt();


        int matriu1[][] = new int[files][columnes];

        for (int i = 0; i < matriu1.length; i++) {
            for (int j = 0; j < matriu1[i].length; j++) {
                System.out.println("Quin valor vols a la posició " + i + " " + j);
                int valor = lector.nextInt();

                if (valor < 0 || valor > 10) {
                    System.out.println("ERROR, el valor ha de ser entre 0 i 10!");
                    System.out.println("Quin valor vols a la posició " + i + " " + j);
                    valor = lector.nextInt();
                    matriu1[i][j] = valor;
                    sum = sum + matriu1[i][j];
                }
                else {
                    matriu1[i][j] = valor;
                    sum = sum + matriu1[i][j];
                }
            }
        }

        //Sum última fila
        for (int j = 0; j < matriu1[files - 1].length; j++) {
            sum_ulti_fila = sum_ulti_fila + matriu1[files - 1][j];
        }

        //Sum primera fila
        for (int j = 0; j < matriu1[0].length; j++) {
            sum_prim_fila = sum_prim_fila + matriu1[0][j];
        }

        //Sum primera columna
        for (int i = 0; i < matriu1.length; i++) {
            sum_prim_column = sum_prim_column + matriu1[i][0];
        }

        //Sum última columna
        for (int i = 0; i < matriu1.length; i++) {
            sum_ulti_column = sum_ulti_column + matriu1[i][columnes - 1];
        }

        //Imprimir matriu1
        System.out.println("Matriu1 Generada: ");
        for (int i = 0; i < matriu1.length; i++) {
            for (int j = 0; j < matriu1[i].length; j++) {
                System.out.print(matriu1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
        mitjana = sum /(files * columnes);
        System.out.println(" ");
        System.out.println("La mitjana de la primera matriu és: " + mitjana);
        System.out.println("La suma de la última fila de la matriu és: " + sum_ulti_fila);
        System.out.println("La suma de la primera fila de la matriu és: " + sum_prim_fila);
        System.out.println("La suma de la primera columna de la matriu és: " + sum_prim_fila);
        System.out.println("La suma de la última columna de la matriu és: " + sum_ulti_column);






        //Matriu 2

        sum = 0;
        mitjana = 0;

        System.out.println("De quàntes files vols a la segona matriu? ");
        int files2 = lector.nextInt();
        System.out.println("De quàntes files vols a la segona matriu? ");
        int columnes2 = lector.nextInt();

        if (files != files2 || columnes != columnes2) {
            System.out.println("Les dues matrius han de ser de la mateixa grandària!");
            System.out.println("De quàntes files vols a la segona matriu? " + "(" + files + ")");
            files2 = lector.nextInt();
            System.out.println("De quàntes columnes vols a la segona matriu? " + "(" + columnes + ")");
            columnes2 = lector.nextInt();
        }


        int matriu2[][] = new int[files2][columnes2];

        for (int i = 0; i < matriu2.length; i++) {
            for (int j = 0; j < matriu2[i].length; j++) {
                System.out.println("Quin valor vols a la posició " + i + " " + j);
                int valor = lector.nextInt();

                if (valor < 0 || valor > 10) {
                    System.out.println("ERROR, el valor ha de ser entre 0 i 10!");
                    System.out.println("Quin valor vols a la posició " + i + " " + j);
                    valor = lector.nextInt();
                    matriu2[i][j] = valor;
                    sum = sum + matriu2[i][j];
                }
                else {
                    matriu2[i][j] = valor;
                    sum = sum + matriu2[i][j];
                }
            }
        }

        //Imprimir matriu2
        System.out.println("Matriu2 Generada: ");
        for (int i = 0; i < matriu2.length; i++) {
            for (int j = 0; j < matriu2[i].length; j++) {
                System.out.print(matriu2[i][j] + " ");
            }
            System.out.println();
        }
        mitjana = sum / (files2 * columnes2);
        System.out.println(" ");
        System.out.println("La mitjana de la segona matriu és: " + mitjana);



        //Matriu suma

        sum = 0;
        mitjana = 0;

        int matriu_sum[][] = new int[files][columnes];

        for (int i = 0; i < matriu_sum.length; i++) {
            for (int j = 0; j < matriu_sum[i].length; j++) {
                matriu_sum[i][j] = (matriu1[i][j] + matriu2[i][j]);
            }
        }

        //Imprimir matriu_sum
        System.out.println("Matriu amb la suma: ");
        for (int i = 0; i < matriu_sum.length; i++) {
            for (int j = 0; j < matriu_sum[i].length; j++) {
                System.out.print(matriu_sum[i][j] + " ");
                sum = sum + matriu_sum[i][j];
            }
            System.out.println();
        }
        mitjana = sum / (files2 * columnes2);
        System.out.println(" ");
        System.out.println("La mitjana de la segona matriu és: " + mitjana);


    }
}