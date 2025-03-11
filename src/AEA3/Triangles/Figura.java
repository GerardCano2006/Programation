package AEA3.Triangles;

public class Figura {
    private String figura;
    private static int id;

    public Figura(String figura) {
        this.figura = figura;
        id++;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Figura.id = id;
    }

    public void Imprimir_Dades() {
        System.out.println("L'ID del " + getFigura() + " és: " + getId());
        System.out.println("L'àrea del " + getFigura() + " és: " + Calcular_Area());
        System.out.println();
    }

    public double Calcular_Area() { //Només perque l'heredin Triangle i Cercle
        return 0;
    }
}