package AEA3.Recursivitat;

public class Suma_ints {

    public static void main(String[] args) {
        int num = 2;
        System.out.println("La suma d'ints és: " + factorial_sum(num));
    }

    public static int factorial_sum(int n) {
        System.out.println("En aquesta iteracció n = " + n);

        if (n == 0) {       //Cas base (n = 0)
            System.out.println("Estém en el cas base, on n = " + n + "!");
            return 1;
        }

        System.out.println("n no és igual a 0 encara, val " + n + ", aném a cridar a la mateixa funció però amb n = " + (n-1));
        return n + factorial_sum(n - 1); //Ara fem que sumi
    }
}