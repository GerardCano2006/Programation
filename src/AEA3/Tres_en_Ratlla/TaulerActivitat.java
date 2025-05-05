package AEA3.Tres_en_Ratlla;

import AEA3.Funcions.LectorDatosTerminal;

import java.util.Scanner;

public class TaulerActivitat {
    private char[][] tauler;

    LectorDatosTerminal lector = new LectorDatosTerminal();


    public TaulerActivitat() {     //Funció constructora
        tauler = new char[3][3];

        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                tauler[i][j] = '-';
            }
        }
    }

    public void Mostrar_tauler() {
        System.out.println("-------------");
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                System.out.print(tauler[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("-------------");
    }

    public void Marcar_casella(int fila, int columna, char jugador) {
        if (fila >=0 && fila <= 2 && columna >=0 && columna <= 2) {
            if (tauler[fila][columna] == '-') {         //Si la casella està buida i és seleccionada
                tauler[fila][columna] = jugador;        //Pasa a ser marcada pel jugador
            }
        }
        else{
            System.out.println("Introdueix una casella vàlida");
        }
    }

    public boolean Comprovar_guanyador(char jugador) {
        for (int i = 0; i < tauler.length; i++) {
            if (tauler[i][0] == jugador && tauler[i][1] == jugador && tauler[i][2] == jugador) {
                return true;
            }
            if (tauler[0][i] == jugador && tauler[1][i] == jugador && tauler[2][i] == jugador) {
                return true;
            }
            if (tauler[0][0] == jugador && tauler[1][1] == jugador && tauler[2][2] == jugador) {
                return true;
            }
            if (tauler[0][2] == jugador && tauler[1][1] == jugador && tauler[2][0] == jugador) {
                return true;
            }
        }
        return false;
    }

    public boolean Tauler_ple() {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                if (tauler[i][j] == '-') {      //Si hi ha una posició buida, el tauler NO està buit
                    return false;
                }
            }
        }
        System.out.println("El tauler està ple!");
        return true;
    }
}