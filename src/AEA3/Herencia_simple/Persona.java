package AEA3.Herencia_simple;

public class Persona {
    private int id;
    private int edat;
    private String nom;
    private String cognom;
    private String adreca;

    public Persona(int id, String nom, String cognom) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
    }

    public Persona(int id, int edat, String nom, String cognom, String adreca) {
        this.id = id;
        this.edat = edat;
        this.nom = nom;
        this.cognom = cognom;
        this.adreca = adreca;
    }

    //get i set de id
    public int getId() { //Select *
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //get i set de edat
    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    //get i set de nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //get i set de cognom
    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    //get i set de adreca
    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public void imprimir() {
        System.out.println("Persona: ID: " + getId() + ", Edat: "+ getEdat() + ", Nom: " + getNom() + ", Cognom: " + getCognom() + ", Adreça: " + getAdreca());
    }
}
