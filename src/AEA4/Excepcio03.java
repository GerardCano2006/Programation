package AEA4;

public class Excepcio03 {
    public static void main(String args[]) {
        String t[] = {"Hola", "Adéu", "Fins demà"};

        try {       //Programa que vull que s'executi
            for (int i = 0; i < t.length; i++) {
                System.out.println("Posició " + i + ": " + t[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {       //Si l'error és que es passa dels límits (Array)
            System.out.println("T'has passat dels límits");
        }
        catch (StringIndexOutOfBoundsException e) {      //Si l'error és que es passa dels límits (String)
            System.out.println("T'has passat dels límits.2");
        }
        finally {       //S'executa hi hagi error o no
            System.out.println();
            System.out.println("Hem queixaré al Llusti");
        }
        System.out.println("Final del programa");
    }
}
