package AEA2;
public class Trobar_max_min {
    public static void main(String[] args) {

        int numeros[] = {12,3,45,-3,65,-5,88,99,2,23,54,33,27,53,96,0};

        int length= numeros.length;

        int max= numeros[0];
        int min= numeros[0];

        for (int i = 0; i < length; i++) {
            if (numeros[i] <= min){
                min = numeros[i];
            }
            if (numeros[i] >= max){
                max = numeros[i];
            }
        }
        System.out.println("El número més gran és: " + max);
        System.out.println("El número més petit és: " + min);
    }
}