 package AEA3;

public class funcio {
        public static void main(String[] args) {
            int a = 5;
            int b = 10;
            int c = 15;


            calcular_min(5,10,15);
            calcular_max(5,10,15);
            calcular_mitjana(5,10,15);

            int min = calcular_min(a, b, c);
            System.out.println("El valor mínim és: " + min);
        }



    public static int calcular_min(int num1, int num2, int num3) {
            int min;

            if(num1 < num2){
                if (num2 < num3){
                    min = num1;
                    return num1;
                }
            }
            else if(num2 < num1){
                if (num3 < num1){
                    min = num2;
                    return num2;
                }
            }
            else if(num3 < num2){
                if (num1 < num2){
                    min = num3;
                    return num3;
                }
            }
            return 0;
    }



    public static void calcular_max(int num1, int num2, int num3) {
        int max;

        if(num1 < num2){
            if (num2 < num3){
                max = num3;
                System.out.println("El valor màxim és: " + max);
            }
        }
        else if(num2 < num3){
            if (num3 < num1){
                max = num1;
                System.out.println("El valor màxim és: " + max);
            }
        }
        else if(num3 < num1){
            if (num1 < num2){
                max = num2;
                System.out.println("El valor màxim és: " + max);
            }
        }
    }


    public static void calcular_mitjana(int num1, int num2, int num3) {
        int mitjana;
        mitjana = (num1 + num2 + num3) / 3;

        System.out.println("La mitjana és: " + mitjana);
    }


}