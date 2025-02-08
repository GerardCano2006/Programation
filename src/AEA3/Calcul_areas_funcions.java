package AEA3;

import java.util.*;


public class Calcul_areas_funcions {
    public static void main(String[] args) {
        inici();
    }

    public static void inici() {
        Scanner lector = new Scanner(System.in);
        Calcul_areas_funcions2 calculador = new Calcul_areas_funcions2();

        System.out.println();
        System.out.println("De quina figura vols calcular l'àrea?");
        System.out.println("Tens les següents opcions: triangle, quadrat, cercle, trapezi, rombe, paralelogram");
        System.out.println("Per acabar el programa: fi");
        String figura = lector.nextLine();

        boolean fi = false;

        while (!fi) {

            // Crida a les funcions de la classe "Calcul_areas_funcions2", o sigui l'altre fitxer

            if (figura.equalsIgnoreCase("triangle")) {              //Triangle
                System.out.println("Digues l'alçada del triangle");             //Pregunta
                double alcada = lector.nextDouble();

                System.out.println("Digues la base del triangle");
                double base = lector.nextDouble();

                double area_triangle = calculador.calcularTriangle(base,alcada);        //Li dona els valors existents al cridar a la funció

                System.out.println("L'àrea de " + figura + " és: " + area_triangle);

            }
            else if (figura.equalsIgnoreCase("quadrat")) {        //Quadrat
                System.out.println("Quina és la base del quadrat?");
                double base = lector.nextDouble();
                System.out.println("Quina és l'altura del quadrat?");
                double altura = lector.nextDouble();

                double area_quadrat = calculador.calcularQuadrat(base, altura);

                System.out.println("L'àrea de " + figura + " és: " + area_quadrat);

            }
            else if (figura.equalsIgnoreCase("cercle")) {           //Cercle
                System.out.println("Quin és el radi del cercle?");
                double radi = lector.nextDouble();

                double area_cercle = calculador.calcularCercle(radi);

                System.out.println("L'àrea de " + figura + " és: " + area_cercle);
            }
            else if (figura.equalsIgnoreCase("trapezi")) {          //Trapezi
                System.out.println("De quant és la base major:");
                double baseMajor = lector.nextDouble();

                System.out.println("De quant és la base menor:");
                double baseMenor = lector.nextDouble();

                System.out.println("Quina és l'altura del trapezi:");
                double altura = lector.nextDouble();

                double area_trapezi = calculador.calcularTrapezi(baseMajor, baseMenor, altura);

                System.out.println("L'àrea de " + figura + " és: " + area_trapezi);
            }
            else if (figura.equalsIgnoreCase("rombe")) {            //Rombe
                System.out.println("De quant és la diagonal major:");
                double diagonalMajor = lector.nextDouble();

                System.out.println("De quant és la diagonal menor:");
                double diagonalMenor = lector.nextDouble();

                double area_rombe = calculador.calcularRombe(diagonalMajor, diagonalMenor);

                System.out.println("L'àrea de " + figura + " és: " + area_rombe);
            }
            else if (figura.equalsIgnoreCase("paralelogram")) {     //Paral·lelogram
                System.out.println("De quant és la base:");
                double base = lector.nextDouble();

                System.out.println("De quant és l'altura:");
                double altura = lector.nextDouble();

                double area_paralelogram = calculador.calcularParalelogram(base, altura);

                System.out.println("L'àrea de " + figura + " és: " + area_paralelogram);
            }
            else if (figura.equalsIgnoreCase("fi")) {               //FI
                fi = true;
            }
            else {
                System.out.println("Has d'escriure una de les figures!");
                inici();
            }
            inici();

        }
    }
}