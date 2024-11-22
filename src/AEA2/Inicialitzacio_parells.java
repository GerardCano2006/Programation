package AEA2;
public class Inicialitzacio_parells {
    public static void main(String[] args) {

        int [] numeros= new int[51];
        numeros[0]= 0;
        int length= numeros.length;

        for (int i = 1; i < length; i++) {
            numeros[i]= numeros[i -1] + 2;    //numeros[3] = numeros[3 -1] + 2 | (o sigui 4)
        }
        System.out.print("S'ha generat l'array: [ ");

        for (int j = 0; j < length; j++) {
            System.out.print(numeros[j] + " ");
        }
        System.out.print(" ]");
    }
}