import java.util.Scanner;
public class Cotxe {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String[] cars = new String[4];
        int length = cars.length;

        for (int i = 0; i < length; i++) {
            System.out.println("Car " + i + ": ");
            cars[i] = lector.nextLine();
        }

        System.out.println("Els cotxes que has ingressat son:");
        for (int j = 0; j < length; j++) {
            System.out.println(cars[j]);
        }
    }
}