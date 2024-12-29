package AEA2;

import java.util.Scanner;

public class act_repas3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System .in);


        //Matriu 1
        System.out.println("De quàntes files vols que sigui la matriu 1?");
        int files1 = lector.nextInt();
        System.out.println("De quàntes columnes vols que sigui la matriu 1?");
        int columnes1 = lector.nextInt();

        int matriu1[][] = new int[files1][columnes1];

        for (int i = 0; i < matriu1.length; i++) {
            for (int j = 0; j < matriu1[i].length; j++) {
                System.out.println("Quin valor vols que hi hagi a la posició " + i + " " + j);
                int valor1 = lector.nextInt();
                if (valor1 < 0 || valor1 > 10) {
                    System.out.println("ERROR! Ha de ser un nombre entre 0 i 10!");
                    System.out.println("Quin valor vols que hi hagi a la posició " + i + " " + j);
                    valor1 = lector.nextInt();
                }
                else {
                    matriu1[i][j] = valor1;
                }
            }
        }




        //Matriu 2
        System.out.println("De quàntes files vols que sigui la matriu 2?");
        int files2 = lector.nextInt();
        System.out.println("De quàntes columnes vols que sigui la matriu 2?");
        int columnes2 = lector.nextInt();

        if (columnes1 != columnes2 || files1 != files2) {
            System.out.println("Les dues matrius han de ser de la mateixa grandària!");
            System.out.println("De quàntes files vols que sigui la matriu 2? (" + files1 + ")");
            files2 = lector.nextInt();
            System.out.println("De quàntes columnes vols que sigui la matriu 2? (" + columnes1 + ")");
            columnes2 = lector.nextInt();
        }

        int matriu2[][] = new int[files2][columnes2];

        for (int i = 0; i < matriu2.length; i++) {
            for (int j = 0; j < matriu2[i].length; j++) {
                System.out.println("Quin valor vols que hi hagi a la posició " + i + " " + j);
                int valor2 = lector.nextInt();
                if (valor2 < 0 || valor2 > 10) {
                    System.out.println("ERROR! Ha de ser un nombre entre 0 i 10!");
                    System.out.println("Quin valor vols que hi hagi a la posició " + i + " " + j);
                    valor2 = lector.nextInt();
                }
                else {
                    matriu2[i][j] = valor2;
                }
            }
        }



        //Imprimir Matriu 1
        System.out.println("Matriu1:");
        for (int i = 0; i < matriu1.length; i++) {
            for (int j = 0; j < matriu1[i].length; j++) {
                System.out.print(matriu1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");

        //Imprimir Matriu 2
        System.out.println("Matriu2:");
        for (int i = 0; i < matriu2.length; i++) {
            for (int j = 0; j < matriu2[i].length; j++) {
                System.out.print(matriu2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");





        //Matriu Suma_Matrius
        int sum_matrius[][] = new int[files1][columnes1];

        for (int i = 0; i < sum_matrius.length; i++) {
            for (int j = 0; j < sum_matrius[i].length; j++) {
                sum_matrius[i][j] = (matriu1[i][j] + matriu2[i][j]);
            }
        }

        //Imprimir Suma_Matrius
        System.out.println("Suma Matrius:");
        for (int i = 0; i < sum_matrius.length; i++) {
            for (int j = 0; j < sum_matrius[i].length; j++) {
                System.out.print(sum_matrius[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");

    }
}