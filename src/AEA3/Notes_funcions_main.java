package AEA3;

import AEA3.Funcions.LectorDatosTerminal;
import AEA3.Funcions.RegistreNotes;

public class Notes_funcions_main {
    public static void main(String[] args) {
        inici();
    }

    public static void inici() {
        RegistreNotes calculator = new RegistreNotes();
        LectorDatosTerminal lector = new LectorDatosTerminal();

        double[] notes = new double[6];

        for (int i = 0; i < notes.length; i++) {
            System.out.println("Introdueix la " + i + "a nota");
            notes[i] = lector.leerDouble();
            if (notes[i] < 0 || notes[i] > 10) {
                System.out.println("ERROR, notes entre 0 i 10!");
                System.out.println("Introdueix la " + i + "a nota");
                notes[i] = lector.leerDouble();
            }
        }

        double maxim_notes = calculator.calcularMaxim(notes);
        double minim_notes = calculator.calcularMinim(notes);
        double mitjana_notes = calculator.calcularMitjana(notes);

        System.out.println("La nota més alta és: " + maxim_notes);
        System.out.println("La nota més baixa és: " + minim_notes);
        System.out.println("La mitjana de notes és: " + mitjana_notes);
    }
}
