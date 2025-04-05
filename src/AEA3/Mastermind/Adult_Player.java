package AEA3.Mastermind;
import AEA3.Funcions.LectorDatosTerminal;

import java.util.Scanner;

public class Adult_Player extends Player {
    LectorDatosTerminal lector = new LectorDatosTerminal();

    public Adult_Player() {
        super(5); // Códi de 5 lletres
    }

    @Override
    public String makeGuess() {
        System.out.print("Jugador adult, escriu 5 lletres: ");
        return lector.leerString();
    }
}