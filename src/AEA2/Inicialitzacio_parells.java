package AEA2;

import java.sql.SQLOutput;
import java.util.*;

public class Inicialitzacio_parells {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System .in);

        int[] vector_parells = new int[100];

        System.out.println("Vector amb els primers 100 números parells: ");
        for (int i = 0; i < vector_parells.length; i++) {
            vector_parells[i] = i *2;
            System.out.print(vector_parells[i] + " ");
        }
        System.out.println(" ");

        int[] vector_senars = new int[100];

        System.out.println("Vector amb els primers 100 números senars: ");
        for (int i = 0; i < vector_senars.length; i++) {
            vector_senars[i] = i *2 + 1;
            System.out.print(vector_senars[i] + " ");
        }
        System.out.println(" ");

        int[] vector_sum = new int[100];

        System.out.println("Vector amb la suma de vector_parells (0 - 198) i vector_senars (199 - 1):");
        for (int i = 0; i < vector_sum.length; i++) {
            vector_sum[i] = vector_parells[i] + vector_senars[vector_parells.length -1 -i];
            System.out.print(vector_sum[i] + " ");
        }
        System.out.println(" ");

        int[] vector_parells_reves = new int[100];

        System.out.println("Vector amb vector_parells al revés: ");
        for (int i = vector_parells_reves.length -1; i >= 0; i--) {
            vector_parells_reves[i] = vector_parells[i];
            System.out.print(vector_parells_reves[i] + " ");
        }
        System.out.println(" ");

        int[] vector_senars_reves = new int[100];

        System.out.println("Vector amb vector_senars al revés:");
        for (int i = vector_senars_reves.length -1; i >= 0; i--) {
            vector_senars_reves[i] = vector_senars[i];
            System.out.print(vector_senars_reves[i] + " ");
        }
        System.out.println(" ");

        int[][] matriu_parells = new int[10][10];
        int comptador1 = 0;

        System.out.println("Matriu amb els primers 100 números parells: ");
        for (int i = 0; i < matriu_parells.length; i++) {
            for (int j = 0; j < matriu_parells[i].length; j++) {
                matriu_parells[i][j] = comptador1 *2;
                System.out.print(matriu_parells[i][j] + " ");
                comptador1++;
            }
            System.out.println();
        }
        System.out.println(" ");

        int[][] matriu_senars = new int[10][10];
        int comptador2 = 1;

        System.out.println("Matriu amb els primers 100 números senars: ");
        for (int i = 0; i < matriu_senars.length; i++) {
            for (int j = 0; j < matriu_senars[i].length; j++) {
                matriu_senars[i][j] = comptador2 +2;
                System.out.print(matriu_senars[i][j] + " ");
                comptador2 = comptador2 +2;
            }
            System.out.println();
        }
        System.out.println(" ");

        int[][] matriu_parells_reves = new int[10][10];

        System.out.println("Matriu amb matriu_parells al revés: ");
        for (int i = matriu_parells_reves.length -1; i >= 0; i--) {
            for (int j = matriu_parells_reves.length -1; j >= 0; j--) {
                matriu_parells_reves[i][j] = matriu_parells[i][j];
                System.out.print(matriu_parells_reves[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");

        int[][] matriu_senars_reves= new int[10][10];

        System.out.println("Matriu amb matriu_senars al revés: ");
        for (int i = matriu_senars_reves.length -1; i >= 0; i--) {
            for (int j = matriu_senars_reves.length -1; j >= 0; j--) {
                matriu_senars_reves[i][j] = matriu_senars[i][j];
                System.out.print(matriu_senars_reves[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");


        int[][] matriu_files_parells = new int[10][10];
        int comtador_parells = 0;
        int comptador_senars = 1;

        System.out.println("Matriu amb els 50 números parells en les files parells, i 50 números senars en les files senars: ");
        for (int i = 0; i < matriu_files_parells.length; i++) {
            for (int j = 0; j < matriu_files_parells[i].length; j++) {
                if (i%2 ==0) {
                    matriu_files_parells[i][j] = comtador_parells *2;
                    System.out.print(matriu_files_parells[i][j] + " ");
                    comtador_parells ++;
                }
                else {
                    matriu_files_parells[i][j] = comptador_senars +2;
                    System.out.print(matriu_files_parells[i][j] + " ");
                    comptador_senars = comptador_senars +2;
                }
            }
            System.out.println();
        }
        System.out.println(" ");

        System.out.println("De quàntes files vols la matriu? ");
        int files = lector.nextInt();
        System.out.println("De quàntes columnes vols la matriu? ");
        int columnes = lector.nextInt();

        char[][] matriu_char = new char[files][columnes];

        for (int i = 0; i < matriu_char.length; i++) {
            for (int j = 0; j < matriu_char[i].length; j++) {
                if (i%2 == 0 && j%2 == 0) { //Files i columnes parells
                    matriu_char[i][j] = 'a';
                }
                if (i%2 == 0 && j%2 != 0) { //Files parells i columnes senars
                    matriu_char[i][j] = 'z';
                }
                if (i%2 != 0 && j%2 == 0) { //Files senars i columnes parells
                    matriu_char[i][j] = '2';
                }
                if (i%2 != 0 && j%2 != 0) { //Files i columnes senars
                    matriu_char[i][j] = '-';
                }
                System.out.print(matriu_char[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");

        System.out.println("De quàntes files vols la matriu? ");
        int files2 = lector.nextInt();
        System.out.println("De quàntes columnes vols la matriu? ");
        int columnes2 = lector.nextInt();

        int[][] matriu_num = new int[files2][columnes2];

        int sum = 0;
        int mitjana = 0;

        for (int i = 0; i < matriu_num.length; i++) {
            for (int j = 0; j < matriu_num[i].length; j++) {
                if (i%2 == 0 && j%2 == 0) { //Files i columnes parells
                    matriu_num[i][j] = 1;
                    sum = sum + matriu_num[i][j];
                }
                if (i%2 == 0 && j%2 != 0) { //Files parells i columnes senars
                    matriu_num[i][j] = 2;
                    sum = sum + matriu_num[i][j];
                }
                if (i%2 != 0 && j%2 == 0) { //Files senars i columnes parells
                    matriu_num[i][j] = 3;
                    sum = sum + matriu_num[i][j];
                }
                if (i%2 != 0 && j%2 != 0) { //Files i columnes senars
                    matriu_num[i][j] = 4;
                    sum = sum + matriu_num[i][j];
                }
                System.out.print(matriu_num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");

        mitjana = sum / (files * columnes);
        System.out.println("La mitjana de la matriu és: " + mitjana);


        int[][] matriu_num_reves = new int[files2][columnes2];

        System.out.println("Matriu amb matriu_num al revés: ");
        for (int i = matriu_num_reves.length -1; i >= 0; i--) {
            for (int j = matriu_num_reves.length -1; j >= 0; j--) {
                matriu_num_reves[i][j] = matriu_num[i][j];
                System.out.print(matriu_num_reves[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");


    }
}