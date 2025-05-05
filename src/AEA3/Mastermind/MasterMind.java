package AEA3.Mastermind;
import AEA3.Funcions.LectorDatosTerminal;

import java.util.Scanner;

public class MasterMind {
    public static final String ENCERTAT_3 = "000";   // Per Child (3 lletres)
    public static final String ENCERTAT_5 = "00000"; // Per Adult (5 lletres)

    private CodeGenerator codeGenerator;
    private Player player;
    private Robot_Player robot;
    private Feedback feedback;
    private String secretCode;
    private boolean isRobotTurn;

    public MasterMind(Player player, Robot_Player robot) {
        codeGenerator = new CodeGenerator();
        this.player = player;
        this.robot = robot;
        feedback = new Feedback();
        secretCode = codeGenerator.generateCode(player.getCodeLength());
        isRobotTurn = false; //Comença jugador humà
    }

    public void start() {
        boolean guanyat = false;

        while (!guanyat) {
            if (!isRobotTurn) {
                //Torn jugador
                String guess = player.makeGuess();
                String response = feedback.getFeedback(secretCode, guess);
                System.out.println("Resposta del jugador: " + response);

                if (guess.equals(secretCode)) {
                    System.out.println("Has guanyat!");
                    guanyat = true;
                }
                else {
                    System.out.println("Torn del Robot...");
                    isRobotTurn = true; //Juga el Robot
                }
            }
            else {
                //Torn robot
                String robotGuess = robot.makeGuess();
                String robotFeedback = feedback.getFeedback(secretCode, robotGuess);
                System.out.println("Robot ha generat: " + robotGuess);
                System.out.println("Resposta del Robot: " + robotFeedback);

                if (robotGuess.equals(secretCode)) {
                    System.out.println("El Robot ha guanyat!");
                    guanyat = true;
                } else {
                    robot.updateGuess(robotFeedback); // Modifica estratègia
                    isRobotTurn = false; //Torna a jugar jugador
                }
            }
        }
    }

    public static void main(String[] args) {
        LectorDatosTerminal lector = new LectorDatosTerminal();

        System.out.print("Selecciona el tipus de jugador (1: Adult, 2: Child): ");
        int tipus_jugador = lector.leerInt();

        Player player;
        Robot_Player robot;
        if (tipus_jugador == 1) {
            player = new Adult_Player();
            robot = new Robot_Player(5);
        } else {
            player = new Child_Player();
            robot = new Robot_Player(3);
        }

        MasterMind game = new MasterMind(player, robot);
        game.start();
    }
}