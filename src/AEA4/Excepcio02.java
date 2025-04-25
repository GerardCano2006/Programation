package AEA4;

public class Excepcio02 {
    public static void main(String args[]) {
        String t[] = {"Hola", "Adéu", "Fins demà"};

        try {       //Programa que vull que s'executi
            for (int i = 0; i < t.length; i++) {
                System.out.println("Posició " + i + ": " + t[i]);
            }
        }
        catch (Exception e) {       //Si pasa un error
            System.out.println("Ha hagut un error en el programa");
        }
        finally {       //S'executa hi hagi error o no
            System.out.println();
            System.out.println("Hem queixaré al Llusti");
        }
    }
}
