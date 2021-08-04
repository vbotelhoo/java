import java.util.Scanner;

public class exercicio5{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);

        double v, t, consumo, d;

        System.out.println("Digite o tempo de duracao:");
        t = x.nextDouble();

        System.out.println("Digite a velocidade media durante a viagem:");
        v = x.nextDouble();

        d = t * v;

        consumo = d / 12;

        System.out.printf("A distancia percorrida foi de %.1f km e o foi utilizado %.2f Litros de combustivel.", d, consumo);


    }

}