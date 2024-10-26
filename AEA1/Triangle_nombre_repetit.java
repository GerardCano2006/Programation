import java.util.Scanner;

public class Triangle_nombre_repetit {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);

		System.out.print("Input number of rows: ");
		int nombre=lector.nextInt();

		for (int i=1; i <= nombre; i++) {
			for (int j=1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}