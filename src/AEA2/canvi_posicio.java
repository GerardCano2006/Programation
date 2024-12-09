package AEA2;

public class canvi_posicio {
    public static void main(String[] args) {
            int[] vector = {1, 2, 3, 4, 5};

            for (int i = 0; i < vector.length / 2; i++) {
                int temp = vector[i];
                vector[i] = vector[vector.length - 1 - i];
                vector[vector.length - 1 - i] = temp;
            }
            for (int j : vector) {
                System.out.print(j + " ");
            }
    }
}