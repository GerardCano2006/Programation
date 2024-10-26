import java.util.Scanner;

public class AreaTriangle {
  public static void main(String[] args){
    Scanner lector = new Scanner(System.in);

    System.out.println("Enter the width of the triangle:");
    float width=lector.nextFloat();

    System.out.println("Enter the height of the triangle:");
    float height=lector.nextFloat();
    
    float AreaTriangle = width * height / 2;
    System.out.println("Area of the triangle is: " + AreaTriangle);
  }
}