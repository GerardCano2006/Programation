package AEA3;

import java.util.Scanner;

public class Calcul_areas_funcions2 {

    // Funció per calcular l'àrea d'un triangle
    public static double calcularTriangle(double base1, double alcada1) {
        double areatriangle = (base1 * alcada1) / 2;

        return areatriangle;
    }

    // Funció per calcular l'àrea d'un quadrat
    public static double calcularQuadrat(double base, double altura) {
        double area_quadrat = base * altura;

        return area_quadrat;
    }

    // Funció per calcular l'àrea d'un cercle
    public static double calcularCercle(double radi) {
        double area_cercle = 3.13 * (radi * radi);

        return area_cercle;
    }

    // Funció per calcular l'àrea d'un trapezi
    public static double calcularTrapezi(double baseMajor, double baseMenor, double altura) {
        double area_trapezi = (baseMajor + baseMenor) * altura / 2;

        return area_trapezi;
    }

    // Funció per calcular l'àrea d'un rombe
    public static double calcularRombe(double diagonalMajor, double diagonalMenor) {
        double area_rombe = (diagonalMajor * diagonalMenor) / 2;

        return area_rombe;
    }

    // Funció per calcular l'àrea d'un paral·elogram
    public static double calcularParalelogram(double base, double altura) {
        double area_paralelogram = base * altura;

        return area_paralelogram;
    }
}