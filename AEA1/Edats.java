package AEA2;

import java.util.Scanner;

public class Edats {
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg = 0;                  //Mitjana
        float sum = 0;                  //Suma
        int length = ages.length;       //Recorri tots els valors
        int min = ages[0];              //Edat min
        int max = ages[0];              //Edat max

        for (int i : ages) {
            sum = sum + i;
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        avg = sum / length;

        System.out.println("La mitjana d'edats és: " + avg);
        System.out.println("L'edat mínima és: " + min);
        System.out.println("L'edat màxima és: " + max);
        System.out.println("I la diferència entre les dos és: " + (max - min));
    }
}