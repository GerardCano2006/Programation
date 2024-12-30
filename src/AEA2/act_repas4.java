package AEA2;

import java.util.*;

public class act_repas4 {
    public static void main(String[] args) {

        int vector[] = {3, 31, 34, 54, 56, 63, 23, 6, 2, 53, 64, 4, 100, 99, 10};

        int max = vector[0];
        int min = vector[0];
        int segonMin = 100;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {      //Si el valor del vector és major a max
                max = vector[i];
            }
            if (vector[i] < min) {      //Si el valor del vector és menor a min
                min = vector[i];
            }
            else if (vector[i] > min && vector[i] <= segonMin) {        //Si el valor del vector és més gran a min, i menor o igual a 100
                segonMin = vector[i];
            }
        }

        // Mostrar resultats
        System.out.println("El número més gran del vector és el " + max);
        System.out.println("El número més petit del vector és el " + min);
        System.out.println("El segon número més petit del vector és el " + segonMin);
    }
}