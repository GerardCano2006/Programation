import java.util.Scanner;

public class multiplicacio {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);

		System.out.println("Escriu un nombre");
	 	double real1=lector.nextDouble();

	 	System.out.println("Escriu un altre nombre");
	 	double real2=lector.nextDouble();
	 	
	 	System.out.println("Aquest és el resultat de " + real1 + " i " + real2 + " = " + real1 * real2);
	 	}
}