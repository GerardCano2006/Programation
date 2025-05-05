package AEA4;

import AEA3.Funcions.LectorDatosTerminal;

public class mitjana3 {     //Pregunta les notes i imprimeix el resultat
    public static void main(String[] args) {
        LectorDatosTerminal lector = new LectorDatosTerminal();
        mitjana2 calculadora = new mitjana2();

        System.out.print("Introdueix la primera nota: ");
        calculadora.setNota1(lector.leerDouble());      //Dona valor a "Nota1" de "mitjana"

        System.out.print("Introdueix la segona nota: ");
        calculadora.setNota2(lector.leerDouble());      //Dona valor a "Nota2" de "mitjana"

        double resultat = calculadora.Calcular_mitjana();
        System.out.println("La mitjana és: " + resultat);
    }
}
