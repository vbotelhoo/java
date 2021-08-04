import java.util.Scanner;
public class exercicio2c{
    public static void main(String args[]){

        Scanner x = new Scanner(System.in);
        
        double b, h, a;

        System.out.println("Digite a base do seu triangulo:");
        b = x.nextDouble();

        System.out.println("Digite a altura do seu triangulo:");
        h = x.nextDouble();

        a = (b*h)/2;

        System.out.printf("A area do seu triangulo e %.2f%n", a);



    }
}