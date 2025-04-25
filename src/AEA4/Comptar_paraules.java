package AEA4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Comptar_paraules {
    public static void main(String[] args) {
        try {
            //Fitxer entrada
            File f = new File("C:\\Users\\Usuario\\Desktop\\Programacion\\src\\AEA4\\entrada.txt");
            Scanner lector = new Scanner(f);

            //Fitxer sortida
            PrintStream sortida = new PrintStream("C:\\Users\\Usuario\\Desktop\\Programacion\\src\\AEA4\\sortida.txt");

            int comptador = 0;

            //Comptem les paraules llegides
            while (lector.hasNext()) {
                String paraula = lector.next();
                comptador++;        //Comptem cada vegada que llegeix una paraula
            }

            //Imprimir resultat
            System.out.println("Hem comptat " + comptador + " paraules");
            System.out.println("Resultat escrit a sortida.txt");

            sortida.print("Hem comptat " + comptador + " paraules");        //Copiem el resultat a "sortida.txt"

        }
        catch (FileNotFoundException e) {       //En cas que no trobi el fitxer "entrada.txt"
            System.out.println("EL fitxer no s'ha trobat!");
        }
    }
}
