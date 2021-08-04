import java.util.Scanner;

public class Uri1019{
    public static void main(String args []) {
        Scanner x = new Scanner(System.in);

        int a, h, m, s;

        a = x.nextInt();

        h = a / 3600;

        m = (a % 3600) / 60;

        s = (a % 3600) % 60;

        System.out.printf("%d : %d : %d\n", h, m, s);

        
    }
}