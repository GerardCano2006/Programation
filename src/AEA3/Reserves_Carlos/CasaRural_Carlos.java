package AEA3.Reserves_Carlos;

public class CasaRural_Carlos extends Allotjament_Carlos {
    private boolean teJardi;
    private boolean tePiscina;

    public CasaRural_Carlos(String nom, int capacitat, boolean disponible, boolean teJardi, boolean tePiscina) {
        super(nom, capacitat, disponible, calcularPreuCasa(teJardi, tePiscina)); // Pasamos el precio calculado
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }

    public boolean isTeJardi() {
        return teJardi;
    }

    public void setTeJardi(boolean teJardi) {
        this.teJardi = teJardi;
        setPreuPerNit(calcularPreuCasa(teJardi, tePiscina)); // Actualizamos el precio si cambia
    }

    public boolean isTePiscina() {
        return tePiscina;
    }

    public void setTePiscina(boolean tePiscina) {
        this.tePiscina = tePiscina;
        setPreuPerNit(calcularPreuCasa(teJardi, tePiscina)); // Actualizamos el precio si cambia
    }

    private static double calcularPreuCasa(boolean teJardi, boolean tePiscina) {
        double preuBase = 150;
        if (teJardi) preuBase = preuBase + 20; // Si té jardí, +20€
        if (tePiscina) preuBase = preuBase + 50; // Si té piscina, +50€
        return preuBase;
    }

    @Override
    public String mostrarInformacio() {
        return super.mostrarInformacio() + ", Jardí: " + (teJardi ? "Sí" : "No") + ", Piscina: " + (tePiscina ? "Sí" : "No");
    }
}
