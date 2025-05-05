package AEA3.Reserves_Carlos;

public class Allotjament_Carlos {

    private String nom;
    private int capacitat;
    private boolean disponible;
    private double preuPerNit;

    public Allotjament_Carlos(String nom, int capacitat, boolean disponible, double preuPerNit) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.disponible = disponible;
        this.preuPerNit = preuPerNit;
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

    public double getPreuPerNit() {
        return preuPerNit;
    }

    public void setPreuPerNit(double preuPerNit) {
        this.preuPerNit = preuPerNit;
    }

    public double calcularPreuTotal(int dies, int persones) {
        double preuTotal = dies * preuPerNit;

        if (persones > this.capacitat) {
            int extraPersones = persones - this.capacitat;
            preuTotal += extraPersones * 20 * dies; // Suposant que cada llit extra costa 20€ per nit
        }

        return preuTotal;
    }

    public String mostrarInformacio() {
        return "Nom: " + getNom() + ", Capacitat: " + getCapacitat() + ", Disponible: " +
                (disponible ? "Sí" : "No") + ", Preu per nit: " + preuPerNit + "€";
    }
}
