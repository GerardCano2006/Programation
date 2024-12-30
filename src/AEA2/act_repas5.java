package AEA2;

import java.util.*;

public class act_repas5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System .in);

        int comptador = 0;

        System.out.println("De quàntes files vols la matriu? ");
        int files = lector.nextInt();
        System.out.println("De quàntes columnes vols la matriu? ");
        int columnes = lector.nextInt();

        int matriu[][] = new int[files][columnes];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu.length; j++) {
                System.out.println("Quin valor vols afegir a la posició " + i + " " + j);
                int valor = lector.nextInt();

                if (valor < 0 || valor > 10){
                    System.out.println("ERROR, valors entre 0 i 10!!");
                }
                else {
                    matriu[i][j] = valor;
                }
            }
        }

        //Imprimir matriu
        System.out.println("Matriu generada: ");
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");

        int numeros[] = new int[11];

        // Contar aparicións de cada número
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                numeros[matriu[i][j]]++;        //És com: numeros[valor], i cada vegada que apareixi el mateix valor, suma 1 al vector numeros
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El número " + i + ": " + numeros[i] + " vegades");
        }

    }
}
