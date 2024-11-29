package AEA2;

import java.util.Scanner;
public class ActExamen {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System .in);

        System.out.println("Benvingut a la tenda!");
        System.out.println("Quants productes voldràs comprar? (5)");
        int compra=lector.nextInt();
        int preu_final=0;

        if(compra > 0){
            for (int i = 0; i <= 5; i++) {
                System.out.println("Introdueix el preu del producte " + i);
                double preus=lector.nextInt();
                if(preus > 50){
                    double descompte= preus - (preus * 0.06);
                    if (descompte >= 15){
                        descompte = 15;
                        System.out.println("El preu del producte és: " + (preus - descompte) + "€");
                    }
                    else{
                        System.out.println("El preu del producte és: " + (preus - descompte) + "€");
                    }
                }
                else{
                    System.out.println("El preu del producte és: " + preus + "€");
                }
                preu_final += preus;
            }
            System.out.println("");
            System.out.println("El preu final a pagar dels 5 productes és: " + preu_final + "€");
            System.out.println("Moltes gràcies per la seva compra!");
        }
        else{
            System.out.println("No és un número vàlid, si us plau, introdueix un número positiu.");
        }
    }
}
