import java.util.Scanner;
public class Uri1064{
    public static void main(String args []) {
        Scanner x = new Scanner(System.in);

        double num, soma = 0.0, media;
        int qtdePositivos = 0;

        for (int cont = 1; cont <= 6; cont++){
            num = x.nextDouble();
            if(num > 0){
                qtdePositivos++;
                soma += num;
            }
        }
        media = soma / qtdePositivos;
        System.out.println(qtdePositivos + " valores positivos");
        System.out.printf("%.1f\n", media );
    }
}