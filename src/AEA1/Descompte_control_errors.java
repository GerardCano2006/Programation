package AEA1;

import java.util.Scanner;

public class Descompte_control_errors {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);

		System.out.println("Quant has pagat? ");
	 	double preu=lector.nextDouble();
	 	
	 	if (preu >= 0) { 		//El preu és positiu.
	 		if(preu >=100){ 	//El preu és positiu i igual o major a 100 (perque s'apliqui el AEA1.descompte).
	 			double descompteFet = preu * 8 / 100;
	 			if (descompteFet > 10) {
		 			descompteFet = 10;
	 			}
	 			preu = preu - descompteFet;		//El preu és positiu però no igual ni major a 100, per tant, no s'aplica el AEA1.descompte.
	 		}
			System.out.println("Preu Final: " + preu);
	 	}
 		else { 
			System.out.println("El preu és incorrecte"); //El preu és 0 o negatiu.
		}
	}
}