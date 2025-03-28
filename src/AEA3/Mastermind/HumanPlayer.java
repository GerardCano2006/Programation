package AEA3.Mastermind;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String makeGuess() {
        System.out.print("Escriu 3 lletres minúscules: ");
        return scanner.next();
    }
}