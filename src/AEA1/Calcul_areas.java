package AEA1;

import java.util.Scanner;

public class Calcul_areas {
  public static void main(String[] args){
    Scanner lector = new Scanner(System.in);

    System.out.println("De quina figura vols calcular l'àrea?");
    String triangle="triangle";
    String quadrat="quadrat";
    String trapezi="trapezi";
    String rombe="rombe";
    String paralelogram="paralelogram";
    String cercle="cercle";
    System.out.println("Tens les seguents opcións:" + triangle + "  " + cercle + "  " + trapezi + "  " + rombe + "  " + paralelogram);
    String figura=lector.nextLine();
    double area=0;
    boolean figurabona = false;

//---------------------------------------------------------Triangle

    if (figura.equals("triangle")) {
      System.out.println("Quina és la base del triangle:");
      double base=lector.nextFloat();

      System.out.println("Quina és la altura del triangle:");
      double altura=lector.nextFloat();

      area = area + base * altura / 2;
      figurabona = true;


//---------------------------------------------------------Cercle

    } else if (figura.equals("cercle")) {
      System.out.println("Quin és el radi del cercle:");
      double radi=lector.nextFloat();

      area = area + 3.14 * (radi * radi);
      figurabona = true;

//---------------------------------------------------------Trapezi

    } else if (figura.equals("trapezi")) {
      System.out.println("De quant és la base major:");
      double bmajor=lector.nextFloat();

      System.out.println("De quant és la base menor:");
      double bmenor=lector.nextFloat();

      System.out.println("Quina és la altura del trapezi:");
      double altura=lector.nextFloat();

      area = area + (bmajor * bmenor) * altura /2;
      figurabona = true;

    
    //---------------------------------------------------------Rombe

    } else if (figura.equals("rombe")) {
      System.out.println("De quant és la diagonal major:");
      double dmajor=lector.nextFloat();

      System.out.println("De quant és la diagonal menor:");
      double dmenor=lector.nextFloat();

      area = area + (dmajor * dmenor);
      figurabona = true;
    
//---------------------------------------------------------Paral·elogram

    } else if (figura.equals("paralelogram")) {
      System.out.println("De quant és la base:");
      double base=lector.nextFloat();

      System.out.println("De quant és l'altura:");
      double altura=lector.nextFloat();

      area = area + (base * altura);
      figurabona = true;

//---------------------------------------------------------Si escriuen una altra cosa que no siguin les figures

    } else {    //figurabona és false
      System.out.println("Has d'escriure una de les figures!");
    }

    if (figurabona) {    //figurabona és true
      System.out.println("L'àrea de la " + figura + " és " + area);
    }
  }
}