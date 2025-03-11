package AEA3.Sistema_Reserves;

import AEA3.Funcions.LectorDatosTerminal;

public class Main_Sistema_Reserves {

    public static void main(String[] args) {
        Allotjament[] allotjaments = new Allotjament[5];
        boolean mostrar_menu = true;
        LectorDatosTerminal lector = new LectorDatosTerminal();

        while (mostrar_menu) {
            System.out.println("Benvingut al menú!");
            System.out.println("Escull una de les següents opcións si us plau:");
            System.out.println("1. Mostrar Allotjaments Disponibles");
            System.out.println("2. Reservar Allotjament");
            System.out.println("3. Alliberar Allotjament");
            System.out.println("4. Cerca Personalitzada");

            int resposta = lector.leerInt();


            if (resposta == 1) {        //Si la resposta és 1
                System.out.println("Aquí té els Allotjaments Disponibles:");
                System.out.println();
            }
        }
    }
}
