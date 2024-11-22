package AEA1;

import java.util.Scanner;

public class Switch {
  public static void main(String[] args){
    Scanner lector = new Scanner(System.in);

    System.out.println("Quin dia vols analitzar?");
      int dia=lector.nextInt(); 
//---------------------------------------------------------Cas 2
    switch(dia) {
      case 2:
        System.out.println("En aquest cas, el nombre de díes és 28 o 29.");
        break;
//---------------------------------------------------------Casos 4, 6, 9 i 11
      case 4:
      case 6:
      case 9:
      case 11: 
        System.out.println("En aquest cas, el nombre de díes és 30.");
        break;
//---------------------------------------------------------Casos 1, 3, 5, 7, 8, 10 i 12
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("En aquest cas, el nombre de díes és 31.");
        break;
//---------------------------------------------------------Cas que no escrigui ningún nombre dels anteriors.
      default:
        System.out.println("No has introduit un número correcte");
    }
  }
}