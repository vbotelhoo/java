import java.util.Scanner;

public class Uri1046{
    public static void main(String argd []) {
        Scanner x = new Scanner(System.in);

        int a, b, total;

        a = x.nextInt();
        b = x.nextInt();

        if ( a > b ) {
            total = ( 24 - ( a - b ) );
            System.out.printf("O JOGO DUROU %d HORA(S)\n", total);
        }
        else if ( a < b ) {
            total = b - a;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", total);
        }
        else{
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}