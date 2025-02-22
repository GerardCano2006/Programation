package AEA3.Tres_en_Ratlla;

import java.util.Scanner;

public class JocActivitat {
    TaulerActivitat Tauler;
    //private Tauler tauler;
    private char jugadorActual;
    private boolean guanyador;
    private Scanner scanner;

    public JocActivitat() {
        jugadorActual = 'X';
        guanyador = false;
        scanner = new Scanner(System .in);
        Tauler = new TaulerActivitat();
    }

    public void iniciar() {
        boolean guanyador = false;
        while (!guanyador && !Tauler.Tauler_ple()) {      //El joc no para m'entres no hi hagi guanyador i el tauler estigui ple
            Tauler.Mostrar_tauler();        //Mostrar tauler
            System.out.println("Jugador " + jugadorActual + " escull una fila");
            int fila = scanner.nextInt();
            System.out.println("Jugador " + jugadorActual + " escull una columna");
            int columna = scanner.nextInt();

            if (fila > 2 || fila < 0) {             //Control d'errors
                System.out.println("Introdueix una posició dins del tauler si us plau");
                System.out.println("Jugador " + jugadorActual + " escull una fila");
                fila = scanner.nextInt();
            }
            if (columna > 2 || columna < 0) {       //Control d'errors
                System.out.println("Introdueix una posició dins del tauler si us plau");
                System.out.println("Jugador " + jugadorActual + " escull una columna");
                columna = scanner.nextInt();
            }

            Tauler.Marcar_casella(fila, columna, jugadorActual);
            guanyador = Tauler.Comprovar_guanyador(jugadorActual);
            if (!guanyador){    //M'entres que no hi hagi un guanyador, que canvii el torn
                Canvia_torn();
            }
        }

        //En el cas de que hi hagi un guanyador o el tauler estigui ple, s'acaba el joc
        if (Tauler.Comprovar_guanyador(jugadorActual)) {
            System.out.println("S'ha acabat el joc!! Tenim guanyador, la " + jugadorActual);
            Tauler.Mostrar_tauler();
        }
        else {
            System.out.println("Tenim empat!");;
        }
    }

    public void Canvia_torn() {
        if (jugadorActual == 'X') {
            jugadorActual = 'O';
        }
        else  {
            jugadorActual = 'X';
        }
    }
}