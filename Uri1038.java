import java.util.Scanner;
public class Uri1038 {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);

        int qnt, cod;
        double total;

        cod = x.nextInt();
        qnt = x.nextInt();

        if (cod == 1) {
            total = qnt * 4.00;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else if (cod == 2) {
            total = qnt * 4.50;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else if (cod == 3) {
            total = qnt * 5.00;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else if (cod == 4) {
            total = qnt * 2.00;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else {
            total = qnt * 1.50;
            System.out.printf("Total: R$ %.2f\n", total);
        }
    }
}