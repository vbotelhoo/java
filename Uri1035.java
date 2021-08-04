import java.util.Scanner;
public class Uri1035{
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        int A, B, C, D;
        A = x.nextInt();
        B = x.nextInt();
        C = x.nextInt();
        D = x.nextInt();

        if ((B > C) && (D > A) && ((C + D)>(A + B)) && (C > 0 && D > 0) && (A % 2 == 0)){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }

    }    
}