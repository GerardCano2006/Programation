package AEA2;

import java.util.Scanner;

public class act_repas3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;

        //Matriu 1

        System.out.println("De quàntes files vols la 1a matriu? ");
        int files1 = lector.nextInt();

        System.out.println("De quàntes columnes vols la 1a matriu? ");
        int columnes1 = lector.nextInt();

        int matriu1[][] = new int[files1][columnes1];

        for (int i = 0; i < matriu1.length; i++) {
            for (int j = 0; j < matriu1[i].length; j++) {
                System.out.println("Quin valor vols que hi hagi en la posició: " + i + " " + j);
                int valor1 = lector.nextInt();
                if (valor1 < 0 || valor1 > 10){
                    System.out.println("ERROR, ha de ser un valor entre 0 i 10");
                    System.out.println("Quin valor vols que hi hagi en la posició: " + i + " " + j);
                    valor1 = lector.nextInt();
                }
                else {
                    matriu1[i][j] = valor1;
                    sum1 = sum1 + matriu1[i][j];
                }
            }
        }

        System.out.println("Matriu 1:");
        for (int i = 0; i < matriu1.length; i++) {
            for (int j = 0; j < matriu1[i].length; j++) {
                System.out.print(matriu1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("La suma total de la 1a matriu és: " + sum1);


        //Matriu 2

        System.out.println("De quàntes files vols la 2a matriu? ");
        int files2 = lector.nextInt();

        System.out.println("De quàntes columnes vols la 2a matriu? ");
        int columnes2 = lector.nextInt();

        int matriu2[][] = new int[files2][columnes2];

        for (int i = 0; i < matriu2.length; i++) {
            for (int j = 0; j < matriu2[i].length; j++) {
                System.out.println("Quin valor vols que hi hagi en la posició: " + i + " " + j);
                int valor2 = lector.nextInt();
                if (valor2 < 0 || valor2 > 10){
                    System.out.println("ERROR, ha de ser un valor entre 0 i 10");
                    System.out.println("Quin valor vols que hi hagi en la posició: " + i + " " + j);
                    valor2 = lector.nextInt();
                }
                else {
                    matriu2[i][j] = valor2;
                    sum2 = sum2 + matriu2[i][j];
                }
            }
        }

        System.out.println("Matriu 2:");
        for (int i = 0; i < matriu2.length; i++) {
            for (int j = 0; j < matriu2[i].length; j++) {
                System.out.print(matriu2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("La suma total de la 2a matriu és: " + sum2);


        //Suma matrius

        System.out.println("La suma TOTAL de les dues matrius és: " + (sum1 + sum2));


    }
}