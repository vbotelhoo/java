import java.util.Scanner;
public class exercicio3{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);

        double salario, kw, pagar, valorDesconto, valorKw;

        System.out.println("Digite o valor do salario minimo:");
        salario = x.nextDouble();

        valorKw = (salario*0.1428571428571429)/100;

        System.out.println("Digite o valor gasto em KW:");
        kw = x.nextDouble();

        pagar = kw * valorKw;

        valorDesconto = pagar * 0.9;


        
        System.out.printf("O valor de cada KW e de RS%.2f%n", valorKw);
        System.out.printf("O valor a ser pago por %.2f KW e de RS%.2f%n", kw, pagar);
        System.out.printf("O valor a ser pago com 10 por cento de desconto e RS%.2f%n",valorDesconto);

    }
}