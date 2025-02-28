package AEA3.Herencia_simple;

import AEA3.Herencia_simple.Persona;
import AEA3.Herencia_simple.Estudiant;

public class Main_Persona {
    public static void main(String[] args) {

        //Dades de Persona
        Persona p1 = new Persona(2, 31, "Marina", "Morena", "Carrer Montaner");

        //p1 crida la funció imprimir();
        p1.imprimir();

        //Dades d'Estudiant
        Estudiant e1 = new Estudiant(2,"Gerard", "Cano","DAM", "Programació", "Prat Educació", 10);

        //e1 crida la funció imprimir();
        e1.imprimir();
    }
}
