import java.util.Scanner;

public class Uri1018{
    public static void main(String args []) {
        
        Scanner x = new Scanner(System.in);

        int valor, n1, n2, n5, n10, n20, n50, n100;

        valor = x.nextInt();

        n100 = valor / 100;
        n50 = (valor % 100) / 50;
        n20 = ((valor % 100) % 50) / 20;
        n10 = (((valor % 100) % 50) % 20) / 10;
        n5 = ((((valor % 100) % 50) % 20) % 10) / 5;
        n2 = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
        n1 = ((((((valor % 100) % 50) % 20) % 10) % 5) % 2) / 1;

        System.out.println(valor);
        System.out.printf("%d nota(s) de R$ 100,00\n", n100);
        System.out.printf("%d nota(s) de R$ 50,00\n", n50);
        System.out.printf("%d nota(s) de R$ 20,00\n", n20);
        System.out.printf("%d nota(s) de R$ 10,00\n", n10);
        System.out.printf("%d nota(s) de R$ 5,00\n", n5);
        System.out.printf("%d nota(s) de R$ 2,00\n", n2);
        System.out.printf("%d nota(s) de R$ 1,00\n", n1);
    }
}