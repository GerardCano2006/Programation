package AEA4;

public class mitjana2 extends mitjana {

    @Override
    public double Calcular_mitjana() {      //Fà la suma
        double suma = getNota1() + getNota2();
        System.out.println("Suma interna (mitjana2): " + suma);
        return suma / 2;
    }
}