package AEA3.Escola;

public class Estudiants {
    private String nom;
    private int edat;
    private int qualificacions;

    public Estudiants(String nom, int edat, int qualificacions) {
        this.nom = nom;
        this.edat = edat;
        this.qualificacions = qualificacions;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public int getQualificacions() {
        return qualificacions;
    }

    public void setQualificacions(int qualificacions) {
        this.qualificacions = qualificacions;
    }

    public boolean Sistema_aprovat() {
        if (getQualificacions() >= 5) {
            return true;
        }
        else {
            return false;
        }
    }
}
