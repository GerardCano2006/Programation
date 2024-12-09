package AEA2;

import java.util.Arrays;

public class act_repas4 {
    public static void main(String[] args) {

        int vector[] = {3,31,34,54,56,63,23,6,2,53,64,4,100,99,10};
        Arrays.sort(vector);            //Ordena de més petit a més gran

        System.out.println("El segon número més petit és el: " + vector[1]);
        System.out.println("M'entres que el més petit és el: " + vector[0]);
        System.out.println("I el més gran és el: " + vector[14]);
    }
}