package AEA3.Mastermind;
import AEA3.Funcions.LectorDatosTerminal;

import java.util.Scanner;

public class Child_Player extends Player {
    LectorDatosTerminal lector = new LectorDatosTerminal();

    public Child_Player() {
        super(3); // Códi de 3 lletres
    }

    @Override
    public String makeGuess() {
        System.out.print("Jugador child, escriu 3 lletres ");
        return lector.leerString();
    }
}