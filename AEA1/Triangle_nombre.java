import java.util.Scanner;

public class Triangle_nombre {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);

		System.out.print("Input number of rows: ");
		int nombre=lector.nextInt();

		for (int i=1; i <= nombre; i++) {
			for (int j=1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();           //Salta de fila si j és igual a i
		}
	}
}