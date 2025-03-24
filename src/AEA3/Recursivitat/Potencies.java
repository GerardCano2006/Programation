package AEA3.Recursivitat;

public class Potencies {

    public static void main(String[] args) {
        int base = 4;
        int exponent = 4;
        System.out.println(base + "^" + exponent + " = " + potencies(base, exponent));
    }

    public static int potencies(int base, int exponent) {
        System.out.println("En aquesta iteracció base = " + base + " i exponent = " + exponent);

        if (exponent == 0) {        //Cas Base (exponent = 0)
            System.out.println("Estém en el cas base, on l'exponent = " + exponent + " i base = " + base);
            return 1;
        }
        System.out.println("L'exponent NO és igual a 0. Cridem a la mateixa funció on (base: " + base + ", exponent: " + (exponent - 1) + ")");
        return base * potencies(base, exponent - 1);
    }
}
