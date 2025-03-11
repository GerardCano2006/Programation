package AEA3.Sistema_Reserves;

public class Allotjament {
    private String nom;
    private int capacitat;
    private boolean disponible;

    public Allotjament(String nom, int capacitat, boolean disponible) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.disponible = disponible;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double Calcular_Preu_Nit() {
        return 0;
    }

    public String Mostrar_Informacio() {

    }


}
