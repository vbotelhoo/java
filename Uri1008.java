import java.util.Scanner;

public class Uri1008 {
 
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);

        int a, b;
        double c, z;
        
        a = x.nextInt();
        b = x.nextInt();
        z = x.nextDouble();

        c = b * z;

        System.out.println("NUMBER = " + a);
        System.out.printf("SALARY = U$ %.2f\n", c);

 
    }
 
}