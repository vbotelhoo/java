import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valorInteiro;
        double valorDouble;
        float valorFloat;

        System.out.println("Digite um valor inteiro:");
        valorInteiro = teclado.nextInt();
        System.out.println("Digite um valor Double:");
        valorDouble = teclado.nextDouble();
        System.out.println("Digite um valor Float:");
        valorFloat = teclado.nextFloat();
    

        System.out.printf("Valor inteiro digitado = %d%n", valorInteiro);
        System.out.printf("Valor double digitado = %f%n", valorDouble);
        System.out.printf("Valor float digitado = %f%n", valorFloat);

    }
}