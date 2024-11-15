package AEA2;

import java.util.Scanner;

public class Suma_multiples_de_tres {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        System.out.println("Fins a qun valor vols sumar múltiples de 3? ");
        int resposta=lector.nextInt();

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
        }

    }
}
