package AEA4;

import java.io.*;
import java.util.Scanner;

public class Obrir_fitxer {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\Usuario\\Desktop\\Programacion\\src\\AEA4\\Notes.txt");       //Ruta absoluta del fitxer
            Scanner lector = new Scanner(f);
            System.out.println("Fitxer obert correctament.");
        }

        catch (Exception e) {       //Si algo falla
            System.out.println("Exception " + e);
        }
    }
}