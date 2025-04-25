package AEA4;

import java.io.*;

public class Obtenir_ruta {
    public static void main(String[] args) {
        Obtenir_ruta programa = new Obtenir_ruta();
        programa.inici();
    }

    public void inici() {       //S'inicialitzen dues rutes absolutes diferents
        File carpetaAbs = new File("c:/Temp");
        File fitxerAbs = new File ("c:/Temp/Document.txt");
        File carpetaRel = new File("Temp");
        File fitxerRel = new File("Temp/Document.txt");

        //Mostrem les dades de cada una
        mostrarRutes(carpetaAbs);
        mostrarRutes(fitxerAbs);
        mostrarRutes(carpetaRel);
        mostrarRutes(fitxerRel);
    }

    public void mostrarRutes(File f) {
        System.out.println("La ruta és " + f.getAbsolutePath());
        System.out.println("El seu pare és " + f.getParent());
        System.out.println("El seu nom és " + f.getName() + "\n");
    }
}
