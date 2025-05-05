package AEA3.Tres_en_Ratlla;

import AEA3.Tres_en_Ratlla.TaulerActivitat;
import AEA3.Tres_en_Ratlla.JocActivitat;

import java.util.Scanner;

public class TicTacToeActivitat {
    public static void main(String[] args) {
        System.out.println("Benvingut al tres en ratlla!");
        JocActivitat joc = new JocActivitat();
        joc.iniciar();
    }
}