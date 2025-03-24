package AEA3.Recursivitat;

import AEA3.Funcions.LectorDatosTerminal;

public class Invertir_paraula {

    public static void main(String[] args) {
        String paraula = "Izan";
        String invertida = invertir_paraula(paraula, paraula.length() - 1);     // Iniciem per l'últim comptador
        System.out.println("Cadena invertida: " + invertida);
    }

    public static String invertir_paraula(String paraula, int comptador) {
        if (comptador < 0) { // Cas Base (quan el comptador sigui menor a 0)
            return "";
        }

        System.out.println("El comptador no és menor a 0, tornem a cridar a la funció amb el valor del comptador: " + (comptador - 1));
        return paraula.charAt(comptador) + invertir_paraula(paraula, comptador - 1);        // Recorrem les posicións de la paraula amb el comptador
    }
}
