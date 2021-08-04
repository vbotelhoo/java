import java.util.Scanner;
public class Uri1065{
    public static void main(String args []) {
        Scanner x = new Scanner(System.in);

        int num, qntpar = 0;

        for (int cont = 1 ; cont <= 5 ; cont++){
            num = x.nextInt();
            if(num % 2 == 0){
                qntpar++;
            }
        }
        System.out.println(qntpar + " valores pares");
    }
}