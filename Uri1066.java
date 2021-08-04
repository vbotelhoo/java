import java.util.Scanner;
public class Uri1066{
    public static void main(String args []) {
        Scanner x = new Scanner(System.in);

        int num, qntpar = 0, qntimpar = 0, qntpos = 0, qntneg = 0;

        for(int cont = 0; cont <= 4; cont++){
            num = x.nextInt();
            if(num % 2 == 0){
                qntpar++;
            }
            else if (num % 2 != 0){
                qntimpar++;
            }
            if(num > 0){
                qntpos++;
            }
            else if(num < 0){
                qntneg++;
            }
        }
        System.out.println(qntpar + " valor(es) par(es)");
        System.out.println(qntimpar + " valor(es) impar(es)");
        System.out.println(qntpos + " valor(es) positivo(s)");
        System.out.println(qntneg + " valor(es) negativo(s)");
    }
}