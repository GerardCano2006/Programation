package AEA2;

import java.util.Scanner;

public class act_repas3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int sum=0;

        System.out.println("De quàntes files vols la matriu?");
        int files = lector.nextInt();

        System.out.println("De quàntes columnes vols la matriu?");
        int columnes = lector.nextInt();

        int matriu[][]=new int [files][columnes];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.println("Introdueix el valor de la posició: " + i + "" + j + " de la matriu.");
                int valor = lector.nextInt();
                if (valor >= 0){
                    matriu[i][j]=valor;
                    sum = sum + valor;
                }
                else{
                    System.out.println("Introdueix un volor positiu si us plau");
                    System.out.println("Introdueix el valor de la posició: " + i + "" + j + " de la matriu.");
                    valor = lector.nextInt();
                }
            }
        }
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("La suma total de tots els valors de la matriu és: " + sum);
    }
}