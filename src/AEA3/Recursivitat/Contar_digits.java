package AEA3.Recursivitat;

public class Contar_digits {

    public static void main(String[] args) {
        int numero = 100;
        System.out.println("El número de dígits de " + numero + " és: " + comptarDigits(numero));
    }

    public static int comptarDigits(int numero) {
        System.out.println("Iteracció on el número és: " + numero);

        if (numero < 10) {   // Cas Base: Si el número és menor a 10 (només té un digit)
            System.out.println("Cas Base ón al número només li queda un digit: " + numero);
            return 1;
        }

        System.out.println("EL número és més gran que 10 (més d'un digit), tornem a cridar amb: " + numero /10);
        return 1 + comptarDigits(numero / 10);       // Eliminem l'últim número dividint entre 10
    }
}
