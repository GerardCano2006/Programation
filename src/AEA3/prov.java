package AEA3;

import java.util.Scanner;

public class prov {
    public static void main(String[] args){
        prov programa = new prov();
        programa.inici();
    }

    public void inici() {
        System.out.println("Llegiu un enter pel teclat: ");
        int a = llegirEnterTeclat();
        System.out.println("L'enter ha estat " + a + ".");
        System.out.println("Llegiu un altre enter pel teclat:");
        a = llegirEnterTeclat();
        System.out.println("L'altre enter ha estat " + a + ".");
    }

    public int llegirEnterTeclat() {
        Scanner lector = new Scanner(System .in);
        int enterLlegit = 0;
        boolean llegit = false;
        while (!llegit) {
            llegit = lector.hasNextInt();
            if (llegit) {
                enterLlegit = lector.nextInt();
            }
            else {
                System.out.println("Això no és un enter!");
                lector.next();
            }
        }
        lector.nextLine();

        return enterLlegit;
    }
}