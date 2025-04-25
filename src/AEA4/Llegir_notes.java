package AEA4;

import java.io.File;
import java.util.Scanner;


public class Llegir_notes {
    public static final String MARCA_FI = "fi";

    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\Usuario\\Desktop\\Programacion\\src\\AEA4\\Notes.txt");
            Scanner lector = new Scanner(f);

            boolean llegir = true;

            while (llegir) {
                String nom = lector.next();

                if (nom.equals(MARCA_FI)) {     //Si el valor de "nom" és "fi", acaba (Si llegeix "fi" acaba)
                    llegir = false;
                }
                else {
                    String cognom = lector.next();      //Llegeix cognom
                    System.out.print("Estudiant: " + nom + " " + cognom);

                    double mitjana = llegirNotes(lector);       //Crida la funció "llegirNotes"
                    System.out.println(" − Mitjana: " + mitjana);
                }
            }
        } catch (Exception e) {     //En cas d'error
            System.out.println("1er Error llegint estudiants: " + e);
        }
    }

    public static double llegirNotes(Scanner lector) {
        double suma = 0;
        int comptador = 0;

        try {
            while (lector.hasNext()) {      //M'entres hi hagi algo per llegir (contingut)
                String valor = lector.next();

                if (valor.equals("-1")) {
                    break; //Final de les notes
                }

                // Canviem ',' per '.' per si el fitxer té decimals amb coma
                valor = valor.replace(',', '.');

                double nota = Double.parseDouble(valor); //Convertim de String a Double
                suma = suma + nota; //Sumem la nota
                comptador++;  //Comptem una nota més
            }

            if (comptador == 0) {       //Si el comptador està buit
                return 0;
            }
            else {
                double mitjana = (suma / comptador);        //Calculem la mitjana
                return mitjana;
            }

        } catch (Exception e) {
            System.out.println("2n Error llegint notes: " + e);
            return 0;
        }
    }
}