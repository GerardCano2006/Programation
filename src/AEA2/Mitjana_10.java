package AEA2;

import java.util.Scanner;
public class Mitjana_10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double[] num = new double[5];
        System.out.println("Introdueix la primera nota:");
        num[0] = lector.nextDouble();
        System.out.println("Introdueix la segona nota:");
        num[1] = lector.nextDouble();
        System.out.println("Introdueix la tercera nota:");
        num[2] = lector.nextDouble();
        System.out.println("Introdueix la quarta nota:");
        num[3] = lector.nextDouble();
        System.out.println("Introdueix la cinquena nota:");
        num[4] = lector.nextDouble();

        int length = num.length;

        boolean aprovat = false;

        int i = 0;
        while (!aprovat && i < length) {
            if (num[i] == 10) {
                System.out.println("Has tret un 10! Molt bé");
                aprovat = true;
            }
            i++;
        }

    }
}
