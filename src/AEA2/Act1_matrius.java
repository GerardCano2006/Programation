package AEA2;

import java.util.Scanner;

public class Act1_matrius {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System .in);

        System.out.println("De quàntes files vols que sigui la matriu? ");
        int files = lector.nextInt();
        System.out.println("De quàntes columnes vols que sigui la matriu? ");
        int columnes = lector.nextInt();

        int[][] matriu = new int[files][columnes];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.println("Quin valor vols que hi hagi en la posició " + i + " " + j);
                int valor = lector.nextInt();
                if (valor < 0 || valor > 10) {
                    System.out.println("ERROR, ha de ser un número entre 0 i 10!");
                    System.out.println("Quin valor vols que hi hagi en la posició " + i + " " + j);
                    valor = lector.nextInt();
                    matriu[i][j] = valor;
                }
                else {
                    matriu[i][j] = valor;
                }
            }
        }

        //Imprimir Matriu

        System.out.println("Matriu Generada:");
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
    }
}
