package AEA2;

import java.util.Scanner;

public class Act_vector2 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System .in);

        System.out.println("De quina longitud vols el vector? ");
        int longitud = lector.nextInt();

        int[] vector = new int[longitud];

        System.out.println("Insereix els valors del vector:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Element " + i + ": ");
            int valor = lector.nextInt();
            vector[i] = valor;

            while (valor < 0) {     //Si el valor és negatiu
                if (valor < 0) {
                    System.out.println("Si us plau, inrtrodueix un valor positiu!");
                    System.out.println("Element " + i + ": ");
                    valor = lector.nextInt();
                    vector[i] = valor;
                }
            }

        }
        System.out.println("Insereix el valor a buscar: ");
        int valor_buscat = lector.nextInt();

        boolean trobat = false;
        for (int i = 0; i < vector.length && !trobat; i++) {
            if (vector[i] == valor_buscat) {
                System.out.println("El valor " + valor_buscat + " es troba a la posició " + i);
                trobat = true; //L'ha trobat
            }
        }

        if (!trobat) {  //Si no el troba:
            System.out.println("El valor " + valor_buscat + " no es troba en el vector.");
        }
    }
}