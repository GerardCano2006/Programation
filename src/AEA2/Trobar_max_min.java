package AEA2;

import java.util.*;
public class Trobar_max_min {
    public static void main(String[] args) {

        int numeros[] = {12,3,45,-3,65,-5,88,99,2,23,54,33,27,53,96,0};
        Arrays.sort(numeros);

        int length= numeros.length;

        System.out.println("El número més petit és el: " + numeros[0]);
        System.out.println("El número més gran és el: " + numeros[15]);
    }
}