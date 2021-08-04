import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);

        int X;
        double Y, Z;

        X = a.nextInt();
        Y = a.nextDouble();

        Z = X / Y;

        System.out.printf("%.3f km/l\n", Z);


    }
}