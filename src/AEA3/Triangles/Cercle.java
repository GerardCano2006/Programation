package AEA3.Triangles;

public class Cercle extends Figura{
    private int radi;

    public Cercle(String figura, int radi) {
        super("Cercle");
        this.radi = radi;
    }

    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }

    @Override
    public double Calcular_Area() {
        super.Calcular_Area();      //Crida a "Calcular_Area" de Figura
        return 3.1416 * radi*radi;
    }
}