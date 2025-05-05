package AEA3.Reserves_Carlos;

public class Apartament_Carlos extends Allotjament_Carlos {
    private int habitacions;
    private boolean teCuina;

    public Apartament_Carlos(String nom, int capacitat, boolean disponible, int habitacions, boolean teCuina) {
        super(nom, capacitat, disponible, calcularPreuApartament(habitacions, teCuina)); // Pasamos el precio calculado
        this.habitacions = habitacions;
        this.teCuina = teCuina;
    }

    public int getHabitacions() {
        return habitacions;
    }

    public void setHabitacions(int habitacions) {
        this.habitacions = habitacions;
        setPreuPerNit(calcularPreuApartament(habitacions, teCuina)); // Actualizamos el precio al cambiar habitaciones
    }

    public boolean isTeCuina() {
        return teCuina;
    }

    public void setTeCuina(boolean teCuina) {
        this.teCuina = teCuina;
        setPreuPerNit(calcularPreuApartament(habitacions, teCuina)); // Actualizamos el precio si cambia la cocina
    }

    private static double calcularPreuApartament(int habitacions, boolean teCuina) {
        double preuBase = 100 + (habitacions * 10);
        if (teCuina) {
            preuBase = preuBase + 20;
        }
        return preuBase;
    }

    @Override
    public String mostrarInformacio() {
        return super.mostrarInformacio() + ", Habitacions: " + getHabitacions() + ", Cuina: " + (teCuina ? "Sí" : "No");
    }
}
