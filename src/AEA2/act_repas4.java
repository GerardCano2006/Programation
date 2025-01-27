package AEA2;

import java.util.*;

public class act_repas4 {
    public static void main(String[] args){
        act_repas4 programa = new act_repas4();
        programa.Ordenar();
    }
    int[] vector = {2, 43, 54, 56, 10};

    public void Ordenar() {
        int max = vector[0];
        int segon_max = vector[1];

        if (segon_max > max) {
            max = vector[1];
            segon_max = vector[0];
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) { //Si el valor és més gran que max
                segon_max = max;
                max = vector[i];
            }
            else if (vector[i] > segon_max) {       //Si el valor és més gran que segon_min
                segon_max = vector[i];
            }
        }
        System.out.println("El número más grande es: " + max);
        System.out.println("El segundo número más grande es: " + segon_max);
    }
}