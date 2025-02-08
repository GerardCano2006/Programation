package AEA1;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;


public class Calcul_areas {
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);

    System.out.println("De quina figura vols calcular l'àrea?");
    System.out.println("Tens les següents opcions: triangle, cercle, trapezi, rombe, paralelogram");
    String figura = lector.nextLine();

    double area = 0;

    if (figura.equals("triangle")) {
      area = calcularTriangle(lector);
    }
    else if (figura.equals("cercle")) {
      area = calcularCercle(lector);
    }
    else if (figura.equals("trapezi")) {
      area = calcularTrapezi(lector);
        }
    else if (figura.equals("rombe")) {
      area = calcularRombe(lector);
    }
    else if (figura.equals("paralelogram")) {
      area = calcularParalelogram(lector);
    }

    System.out.println("L'àrea de la " + figura + " és " + area);
  }

  // Funció per calcular l'àrea d'un triangle
  public static double calcularTriangle(Scanner lector) {
    System.out.println("Quina és la base del triangle:");
    double base = lector.nextDouble();

    System.out.println("Quina és l'altura del triangle:");
    double altura = lector.nextDouble();

    return (base * altura) / 2;
  }

  // Funció per calcular l'àrea d'un cercle
  public static double calcularCercle(Scanner lector){
    System.out.println("Quin és el radi del cercle? ");
    double radi = lector.nextDouble();

    return 3.14 * (radi * radi);
  }

  // Funció per calcular l'àrea d'un trapezi
  public static double calcularTrapezi(Scanner lector) {
    System.out.println("De quant és la base major:");
    double baseMajor = lector.nextDouble();

    System.out.println("De quant és la base menor:");
    double baseMenor = lector.nextDouble();

    System.out.println("Quina és l'altura del trapezi:");
    double altura = lector.nextDouble();

    return (baseMajor + baseMenor) * altura / 2;
  }

  // Funció per calcular l'àrea d'un rombe
  public static double calcularRombe(Scanner lector) {
    System.out.println("De quant és la diagonal major:");
    double diagonalMajor = lector.nextDouble();

    System.out.println("De quant és la diagonal menor:");
    double diagonalMenor = lector.nextDouble();

    return (diagonalMajor * diagonalMenor) / 2;
  }

  // Funció per calcular l'àrea d'un paral·elogram
  public static double calcularParalelogram(Scanner lector) {
    System.out.println("De quant és la base:");
    double base = lector.nextDouble();

    System.out.println("De quant és l'altura:");
    double altura = lector.nextDouble();

    return base * altura;
  }
}