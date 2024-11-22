package AEA2;
public class Trobar_max_min {
    public static void main(String[] args) {

        int numeros[] = {12,3,45,-3,65,-5,88,99,2,23,54,33,27,53,96,0};

        int length= numeros.length;

        int max= numeros[0];
        int min= numeros[0];

        for (int i = 0; i < length; i++) {
            if (numeros[i] <= min){             //Si el número mirat és més petit que min (primer valor), min serà igual a aquest nou num.
                min = numeros[i];
            }
            if (numeros[i] >= max){             //Si el número mirat és més gran que max (primer valor), max serà igual a aquest nou num.
                max = numeros[i];
            }
        }
        System.out.println("El número més gran és: " + max);
        System.out.println("El número més petit és: " + min);
    }
}