import java.util.Scanner;

public class descompte {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);

		System.out.println("Quant has pagat? ");
	 	float real1=lector.nextFloat();
	 	
	 	if (real1 >= 95) {
	 		float descompteFet = real1 * 15 / 100;
	 		real1 = real1 - descompteFet;
	 	System.out.println("Preu Final: " + real1);
	 	}
	}
}