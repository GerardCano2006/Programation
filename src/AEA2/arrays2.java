package AEA2;

import java.util.Scanner;

public class arrays2 {
        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);

            char[] num = new char[12];
            int length = num.length;

            for (int j = 0; j < length; j++) {
                System.out.println("Introdueix el valor num" + j + ": ");
                num[j] = lector.next().charAt(0);
            }

            for (int i = 0; i < length; i++) {
                if (num[i] == 'a'){
                    System.out.println("*");
                }
                if (num[i] == '1'){
                    System.out.println("$");
                }
            }

        }
}
