package AEA4;


import AEA3.Funcions.LectorDatosTerminal;
import AEA3.Gos_Gat.Cat;

public class mitjana {      //Defineix l’estructura base per emmagatzemar dues notes i calcular la mitjana de forma genèrica
    private double nota1;
    private double nota2;

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double Calcular_mitjana() {
        return 0;   //No ha de retornar res, ho creem perque ho heredi "mitjana2"
    }
}
