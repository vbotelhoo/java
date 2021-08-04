import java.util.Scanner;

public class exercicio2e{
    public static void main(String args[]){

        Scanner x = new Scanner(System.in);

        double b1, b2, h, a;

        System.out.println("Digite o valor da base menor:");
        b1 = x.nextDouble();

        System.out.println("Digite o valor da base maior:");
        b2 = x.nextDouble();

        System.out.println("Digite o valor da altura:");
        h = x.nextDouble();

        a = ((b1+b2)*h)/2;

        System.out.printf("A area do seu trapezio e %.2f%n", a);

    }
}