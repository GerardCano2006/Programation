package AEA2;

public class deu_x_deu {
    public static void main(String[] args) {

        String matriu[][]=new String[11][10];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j]= "-";
                System.out.print(matriu[i][j]+ " ");
            }
            System.out.println("   --> Fila " + i);
        }
    }
}