package AEA3;

import AEA3.Funcions.LectorDatosTerminal;
import AEA3.TaulerActivitat2;

import java.util.Scanner;

public class JocActivitat2 {
    TaulerActivitat2 Tauler;
    //private Tauler tauler;
    private char jugadorActual;
    private boolean guanyador;
    private Scanner scanner;

    public JocActivitat2() {
        guanyador = false;
        scanner = new Scanner(System .in);
        Tauler = new TaulerActivitat2(4);
        EscollirJugador();
    }

    public void iniciar() {
        boolean gano = false;
        while (!gano && !Tauler.Tauler_ple()) {      //El joc no para m'entres no hi hagi guanyador i el tauler estigui ple
            Tauler.Mostrar_tauler();        //Mostrar tauler
            System.out.println("Jugador " + jugadorActual + " escull una fila");
            int fila = scanner.nextInt();
            System.out.println("Jugador " + jugadorActual + " escull una columna");
            int columna = scanner.nextInt();

            Tauler.Marcar_casella(fila, columna, jugadorActual);
            gano = Tauler.Comprovar_guanyador(jugadorActual);
            if (!gano){
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

    public void EscollirJugador(){
        boolean jugadorEscolt = false;
        while (!jugadorEscolt){
            System.out.println("Quin jugador comença? (X / O)");
            String jugadorEscoltor = scanner.nextLine();
            if (jugadorEscoltor.equals("X")){
                jugadorActual = 'X';
                jugadorEscolt = true;
            } else if (jugadorEscoltor.equals("O")){
                jugadorActual = 'O';
                jugadorEscolt = true;
            }

        }
    }
}