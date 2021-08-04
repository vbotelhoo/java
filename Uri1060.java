import java.util.Scanner;
public class Uri1060{
    public static void main(String args []) {
        Scanner x = new Scanner(System.in);

        double num;
        int qtdePositivos = 0;

        for (int cont = 1; cont <= 6; cont++){
            num = x.nextDouble();
            if(num > 0){
                qtdePositivos++;
            }
        }
        System.out.println(qtdePositivos + " valores positivos");
    }
}