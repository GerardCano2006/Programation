package AEA3.Recursivitat;

public class Fibonacci {

    // fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
    public static int fibonacci(int n) {
        if (n == 0) return 0; // Caso base 1
        if (n == 1) return 1; // Caso base 2
        return fibonacci(n - 1) + fibonacci(n - 2); // Llamada recursiva
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println("El término " + num + " de Fibonacci es: " + fibonacci(num));
    }
}
