package AEA3.Reserves_Carlos;

public class Habitacio_Carlos extends Allotjament_Carlos {
    private int numLlits;

    public Habitacio_Carlos(String nom, int capacitat, boolean disponible, int numLlits) {
        super(nom, capacitat, disponible, calcularPreuHabitacio(numLlits)); // Pasar el precio al constructor padre
        this.numLlits = numLlits;
    }

    public int getNumLlits() {
        return numLlits;
    }

    public void setNumLlits(int numLlits) {
        this.numLlits = numLlits;
        setPreuPerNit(calcularPreuHabitacio(numLlits)); // Actualitzar el preu al cambiar el número de llits
    }

    private static double calcularPreuHabitacio(int numLlits) {
        return (numLlits > 2) ? 50 + ((numLlits - 2) * 20) : 50;
    }

    @Override
    public String mostrarInformacio() {
        return super.mostrarInformacio() + ", Llits: " + getNumLlits();
    }
}
