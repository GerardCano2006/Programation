package AEA2;

import java.util.Scanner;
public class act_repas5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int comptador=0;
        int valor = 0;

        System.out.println("De quàntes files vols la matriu?");
        int files = lector.nextInt();

        System.out.println("De quàntes columnes vols la matriu?");
        int columnes = lector.nextInt();

        int matriu[][]=new int [files][columnes];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.println("Introdueix el valor de la posició: " + i + "" + j + " de la matriu.");
                valor = lector.nextInt();
                if (valor > 0 && valor < 10){       //El valor introduit a la matriu ha de ser entre 0 i 10
                    if ((i != j){
                        comptador ++;
                    }
                }
                else {                              //Si no està entre 0 i 10
                    System.out.println("Introdueix un valor entre el 0 i el 10 si us plau.");
                }
            }
        }

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("El valor: " + valor + "es repeteix " + columnes + "vegades");

    }
}
