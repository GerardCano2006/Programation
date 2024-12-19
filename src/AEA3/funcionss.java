package AEA3;
//si és void no té paràmetres de sortida
public class funcionss {
    public static void main(String[] args) {
        estrelles(6); //imprimeix 6 estrelles
        guio(1);      //imprimeix 1 guió
        numeros(6, 5); //imprimeix 6 vegades 5
        estrelles(3);       //imprimeix 3 estrelles
        guio(5);      //imprimeix 5 guións
        numeros(2, 3); //imprimeix 3 vegades 2
    }

    //si és void no té paràmetres de sortida
    public static void estrelles(int quantitat_e){
        for (int i = 0; i < quantitat_e; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void guio(int quantitat_g){
        for (int i = 0; i < quantitat_g; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }

    public static void numeros(int quantitat_n, int valor){
        for (int i = 0; i < quantitat_n; i++) {
            System.out.print(valor);
        }
        System.out.println("");
    }

}
