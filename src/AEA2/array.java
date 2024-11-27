package AEA2;

import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double[] num = new double[5];
        System.out.println("Introdueix el primer valor:");
        num[0] = lector.nextDouble();
        System.out.println("Introdueix el segon valor:");
        num[1] = lector.nextDouble();
        System.out.println("Introdueix el tercer valor:");
        num[2] = lector.nextDouble();
        System.out.println("Introdueix el quart valor:");
        num[3] = lector.nextDouble();
        System.out.println("Introdueix el cinqué valor:");
        num[4] = lector.nextDouble();

        int length = num.length;

        for (int i = 0; i < length; i++) {
            System.out.println("Els valors són:" + num[i]);
        }

    }
}