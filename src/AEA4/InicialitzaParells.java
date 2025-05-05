package AEA4;

public class InicialitzaParells {
  public static void main(String[] args) {

    int[] arrayParells = new int[100];

    try {
      for(int i = 0; i <= arrayParells.length; i++) {
        arrayParells[i] = 2*i;
        System.out.print(arrayParells[i] + " ");
      }
    }

    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Hi ha hagut un error!");
    }
  }
}
