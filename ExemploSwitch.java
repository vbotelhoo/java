import java.util.Scanner;

public class ExemploSwitch{
    public static void main(String args []) {
        Scanner x = new Scanner(System.in);
        int numero;
        numero = x.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Digitou o numero 1");
                break;
            case 2:
                System.out.println("Digitou o numero 2");
                break;
            case 3:
                System.out.println("Digitou o numero 3");
                break;
            case 4:
                System.out.println("Digitou o numero 4");
                break;
            default:
                System.out.println("Digitou outro valor maior que 4");
                break;
        }
        
    }
}