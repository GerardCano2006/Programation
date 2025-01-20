package AEA2;

import java.util.Scanner;

public class Act_vector2 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System .in);

        System.out.println("De quina longitud vols el vector? ");
        int longitud = lector.nextInt();

        int[] vector = new int[longitud];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Quin valor vols afegir en la posició " + i);
            int valor = lector.nextInt();
            if (valor < 0 || valor > 10) {
                System.out.println("ERROR, ha de ser un número entre 0 i 10!");
                System.out.println("Quin valor vols afegir en la posició " + i);
                valor = lector.nextInt();
                vector[i] = valor;
            }
            else {
                vector[i] = valor;
            }
        }
        System.out.println();

        System.out.println("Vector Generat: ");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i];
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        System.out.println("Quin valor vols buscar en el vector?");
        int valor_buscat = lector.nextInt();

        boolean trobat = false;

        int i = 0;
        while (i < vector.length) {
            if (valor_buscat == vector[i]) {
                System.out.println("El valor " + valor_buscat + " apareix a la posició " + i + " del vector");
                trobat = true;
            }
            i++;
        }

        if (!trobat) {
            System.out.println("El valor " + valor_buscat + " NO apareix en la matriu");
        }
    }
}
