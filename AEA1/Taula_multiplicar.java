import java.util.Scanner;

public class Taula_multiplicar {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);

		System.out.println("Quina taula de multiplicar vols? ");
	 	int i=lector.nextInt();
	 	int x=0;
	 	int multiplicacio=0;


	 	while(x < 10){
	 		x++;
	 		multiplicacio= (i * x);
	 		System.out.println(i + " * " + x + " = " + multiplicacio);
	 	}
	 	System.out.println("Aquesta ha estat la taula del " + i);
	}
}

