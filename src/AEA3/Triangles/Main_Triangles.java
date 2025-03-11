package AEA3.Triangles;

import AEA3.Funcions.LectorDatosTerminal;

public class Main_Triangles {
    public static void main(String[] args){
        LectorDatosTerminal lector = new LectorDatosTerminal();     //Que el lector sigui l'escanner del "LectorDatosTerminal"
        boolean motrar_menu = true;

        while (motrar_menu) {
            System.out.println("Quina figura vols crear: Triangle, Cercle, o una altra cosa = Exit");
            String eleccio = lector.leerString();

            if (eleccio.equalsIgnoreCase("Triangle")) {     //Si escollim Triangle, creem un triangle nou
                System.out.println("Digues l'alçada del triangle: ");
                int alcada = lector.leerInt();

                System.out.println("Digues la base del triangle: ");
                int base = lector.leerInt();

                while (alcada <= 0) {
                    if (alcada <= 0) {      //Si les dades son negatives
                        System.out.println("Intordueix números positius Marina anda...");
                        System.out.println("Digues l'alçada del triangle: ");
                        alcada = lector.leerInt();
                    }
                }

                while (base <= 0) {
                    if (base <= 0) {       //Si les dades son negatives
                        System.out.println("Intordueix números positius Marina anda...");
                        System.out.println("Digues la base del triangle: ");
                        base = lector.leerInt();
                    }
                }

                Triangle t1 = new Triangle("Triangle", base, alcada);   //Dades del Triangle

                t1.Imprimir_Dades();

            }
            else if (eleccio.equalsIgnoreCase("Cercle")) {        //Si escollim Cercle, creem un cercle nou
                System.out.println("Digues el radi del cercle: ");
                int radi = lector.leerInt();

                while (radi <= 0) {
                    if (radi <= 0) {        //Si el radi és negatiu
                        System.out.println("Intordueix números positius Marina anda...");
                        System.out.println("Digues el radi del cercle: ");
                        radi = lector.leerInt();
                    }
                }

                Cercle c1 = new Cercle("Cercle", radi);     //Dades del Cercle

                c1.Imprimir_Dades();
            }
            else {
                motrar_menu = false;
            }
        }
    }
}