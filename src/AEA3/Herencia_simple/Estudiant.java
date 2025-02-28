package AEA3.Herencia_simple;

public class Estudiant extends Persona {
    private String curs;
    private String assignatures;
    private String escola;
    private int notes;

    public Estudiant(int id, String nom, String cognom, String curs, String assignatures, String escola, int notes) {
        super(id,nom,cognom);
        this.curs = curs;
        this.assignatures = assignatures;
        this.escola = escola;
        this.notes = notes;
    }

    //get i set de curs
    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    //get i set d'assignatures
    public String getAssignatures() {
        return assignatures;
    }

    public void setAssignatures(String assignatures) {
        this.assignatures = assignatures;
    }

    //get i set de escola
    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    //get i set de notes

    public int getNotes() {
        return notes;
    }

    public void setNotes(int notes) {
        this.notes = notes;
    }

    // Funció imprimir de Persones (super), i d'Estudiant
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Estudiant: Curs: " + getCurs() + ", Assignatures: " + getAssignatures() + ", Escola: " + getEscola() + ", Notes: " + getNotes());
    }
}
