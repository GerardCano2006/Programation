package AEA2;

import java.util.*;

public class act_repas4 {
    public static void main(String[] args) {

        int vector[] = {3, 31, 34, 54, 56, 63, 23, 6, 2, 53, 64, 4, 100, 99, 10};

        int min = vector[0];
        int segon_min = vector[1];

        if (segon_min < min) {
            min = vector[1];
            segon_min = vector[0];
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < min) {
                segon_min = min;
                min = vector[i];
            }
            else if (vector[i] > min && vector[i] < segon_min ) {
                segon_min = vector[i];
            }
        }

        System.out.println("El valor més petit de la matriu és: " + min);
        System.out.println("El segon valor més petit de la matriu és: " + segon_min);

    }
}