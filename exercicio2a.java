import java.util.Scanner;

public class exercicio2a{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);

        double l1, a;

        System.out.println("Digite a largura do quadrado:");
        l1 = x.nextDouble();

        a = l1 * l1;

        System.out.printf("A area do quadro e %.2f%n", a);
    }
}