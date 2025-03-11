package AEA3.Triangles;

public class Triangle extends Figura {
    private int base;
    private int h;

    public Triangle(String figura, int base, int h) {
        super("Triangle");
        this.base = base;
        this.h = h;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double Calcular_Area() {
        super.Calcular_Area();      //Crida a "Calcular_Area" de Figura
        return base * h;
    }
}