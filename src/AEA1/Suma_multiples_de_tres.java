package AEA1;

import java.util.Scanner;

public class Suma_multiples_de_tres {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);

		System.out.println("Fins a qun valor vols sumar múltiples de 3? ");
		int nombre=lector.nextInt();
		int resultat=0;
		int contador=0;

        if(nombre > 0){
            while (nombre >= contador){
                if (contador % 3==0) {                                    
                    System.out.println("Afegim " + contador);
                    resultat = resultat + contador;
                }
                ++contador;
            }
            
            System.out.println("El resultat és " + resultat);

        }else{
            System.out.println("Ha de ser més gran que 0!!");           //Si el nombre és menor a 0.
        }
	}
}