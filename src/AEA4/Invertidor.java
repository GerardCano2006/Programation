package AEA4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Invertidor {
    public static void main(String[] args) {
        try {
            //Fitxer entrada
            File f = new File("C:\\Users\\Usuario\\Desktop\\Programacion\\src\\AEA4\\arxiu.txt");
            Scanner lector = new Scanner(f);

            //Fitxer sortida
            PrintStream sortida = new PrintStream("C:\\Users\\Usuario\\Desktop\\Programacion\\src\\AEA4\\arxiu_invertit.txt");


            while (lector.hasNext()) {
                String linea = lector.nextLine();
                String linea_invertida = Invertir_cadena(linea);

                sortida.print(linea_invertida);     //Escrivim la paraula invertida a "arxiu_invertit.txt"
            }

            //Imprimir resultat
            System.out.println("La frase/paraula ha estat invertida en 'arxiu_invertit.txt'");

        }
        catch (FileNotFoundException e) {
            System.out.println("No s'ha trobat el fitxer, torna a intentar-ho");
        }
    }

    public static String Invertir_cadena(String linea) {    //Invertim la cadena
        String linea_invertida = "";

        for (int i = linea.length() - 1; i >= 0; i--) {
            linea_invertida = linea_invertida + linea.charAt(i);
        }
        return linea_invertida;
    }
}
