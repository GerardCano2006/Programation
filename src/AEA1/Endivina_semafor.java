package AEA1;

import java.util.Scanner;

public class Endivina_semafor {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);

        System.out.println("Comencem el joc" + "\n" + "Endivina el valor enter entre 0 i 10" + "\n" + "Quin valor creus que és? ");
        int resposta=lector.nextInt();
		int intents=0;
        int random_num = (int) (Math.random() * 11);
        boolean fi=false;

        while(!fi){                                             //Mentres fi no sigui true
            if(resposta >= 0 && resposta <= 10){                //Si la resposta és major o igual a 0 i menor o igual a 10 (de 0 a 10).
                if(resposta != random_num){                     //Si la resposta NO és igual al número pensat (fallem).
                    System.out.println("Has fallat! Torna a intentar-ho... Quin valor creus que és? ");
                    resposta=lector.nextInt();
                    intents++;                                  //1 intent consumit.
                    
                    if(intents >= 3){                           //Si intents és major o igual a 3 (s'ha d'acabar el joc).
                    fi = true;
                    System.out.println("Intents màxmis, el número a encertar era el " + random_num);
                    }
                }   
                else{                                           
                    System.out.println("Molt bé! L'has encertat!");     //Si la resposta és igual al número pensat (guanyem).
                    fi = true;
                }
            }
            else{
                System.out.println("ERROR: Introdueix un número positiu o enrtre 0 i 10!");   //Si la resposta no està entre 0 i 10, ERROR i consumeix un intent.
                intents++;
                resposta=lector.nextInt();
            }
        }
	}
}