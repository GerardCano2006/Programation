package AEA1;

import java.util.Scanner;

public class Taula_multiplicar_enrere {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);

		System.out.println("Quina taula de multiplicar vols? ");
	 	int i=lector.nextInt();
	 	int x=10;
	 	int multiplicacio=0;


	 	while(x > 0){
	 		multiplicacio= (i * x);
	 		System.out.println(i + " * " + x + " = " + multiplicacio);
	 		x--;
	 	}
	 	System.out.println("Aquesta ha estat la taula del " + i);
	}
}

