package AEA2;

import java.util.Scanner;

public class Act_vector1 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System .in);

        //Vector1

        System.out.println("De quina longitud vols el vector? ");
        int longitud = lector.nextInt();

        int[] vector1 = new int[longitud];

        for (int i = 0; i < vector1.length; i++) {
                System.out.println("Quin valor vols afegir en la posició " + i);
                int valor = lector.nextInt();
                if (valor < 0 || valor > 10) {
                    System.out.println("ERROR, ha de ser un número entre 0 i 10!");
                    System.out.println("Quin valor vols afegir en la posició " + i);
                    valor = lector.nextInt();
                    vector1[i] = valor;
                }
                else {
                    vector1[i] = valor;
                }
        }

        //Vector2

        System.out.println("De quina longitud vols el 2n vector? ");
        int longitud2 = lector.nextInt();

        if (longitud != longitud2) {
            System.out.println("La longitud dels dos vectors ha de ser la mateixa!!");
            System.out.println("De quina longitud vols el 2n vector? " + "(" + longitud + ")");
            longitud2 = lector.nextInt();
        }

        int[] vector2 = new int[longitud2];

        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Quin valor vols afegir en la posició " + i);
            int valor = lector.nextInt();
            if (valor < 0 || valor > 10) {
                System.out.println("ERROR, ha de ser un número entre 0 i 10!");
                System.out.println("Quin valor vols afegir en la posició " + i);
                valor = lector.nextInt();
                vector2[i] = valor;
            }
            else {
                vector2[i] = valor;
            }
        }

        //Vector sum

        int[] vector_sum = new int[longitud];

        System.out.println("Vector amb la suma de vector1 i vector2: ");
        for (int i = 0; i < vector_sum.length; i++) {
            vector_sum[i] = vector1[i] + vector2[i];
            System.out.print(vector_sum[i] + " ");
        }
    }
}
