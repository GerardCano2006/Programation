package AEA2;

public class Canviem_valors_matriu {
    public static void main(String[] args) {

        int matriu[][]= new int[5][5];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                if (i%2==0 && j%2==0){      //Fila(i) i Columna(j) són parells.
                    matriu[i][j]= 1;
                    System.out.println("La posició " + i + " " + j + " de la matriu matriuParells val: " + matriu[i][j]);
                }
                if (i%2==0 && j%2!=0){      //Fila(i) és parell i Columna(j) és senar.
                    matriu[i][j]= 2;
                    System.out.println("La posició " + i + " " + j + " de la matriu matriuParells val: " + matriu[i][j]);
                }
                if (i%2!=0 && j%2==0){      //Fila(i) és senar i Columna(j) és parell.
                    matriu[i][j]= 3;
                    System.out.println("La posició " + i + " " + j + " de la matriu matriuParells val: " + matriu[i][j]);
                }
                if (i%2!=0 && j%2!=0){      //Fila(i) és senar i Columna(j) és senar.
                    matriu[i][j]= 4;
                    System.out.println("La posició " + i + " " + j + " de la matriu matriuParells val: " + matriu[i][j]);
                }
            }
            System.out.println("La fila " + i + " de la matriu matriuParells ja està tota plena");
            System.out.println();
        }
    }
}
