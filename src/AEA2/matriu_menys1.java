package AEA2;

public class matriu_menys1 {
    public static void main(String[] args) {

        int [][] matriuParells = new int[5][5];

        for (int i = 0; i < matriuParells.length; i++) {
            for (int j = 0; j < matriuParells[i].length; j++) {
                if (i %2==0 && j %2==0){
                    matriuParells[i][j] = -1;
                    System.out.println("La posició " + i + " " + j + " de la matriu matriuParells val: " + matriuParells[i][j]);
                }
                else{
                    matriuParells[i][j] = i;
                    System.out.println("La posició " + i + " " + j + " de la matriu matriuParells val: " + matriuParells[i][j]);
                }
            }
            System.out.println("La fila " + i + " de la matriu matriuParells ja està tota plena");
            System.out.println();
        }
    }
}