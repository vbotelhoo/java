public class Contas{
    public static void main(String args[]){
        int a, b, c;

        a = 23;
        b = 4;

        c = a + b;

        System.out.println("Valor da soma = " + c);

        c = a - b;

        System.out.println("Valor da subt = " + c);

        c = a * b;

        System.out.println("Valor da multi = " + c);

        c = a / b;

        System.out.println("Valor da div = " + c);
        
        c = a % b;

        System.out.println("Valor do resto = " + c);

        System.out.println(" ----------- agora contas com decimais ----------- ");

        float x, y ,z;

        x = 23.0f;
        y = 3.0f;
        z = x / y;

        System.out.println("Valor da divisao com resultado decimal = " + z);
        System.out.printf("Valor da divisao so com dois decimais = %.2f%n", z);
        System.out.printf("Valor da divisao so com tres decimais = %.3f%n", z);

    }
}