public class ExemploDoWhile{
    public static void main(String args []) {

        int num = 5;

        int cont;

        cont = 1;

        do{
            System.out.printf("%d x %d = %d\n", num, cont, num*cont);
            cont++;
        } while (cont <= 10);
    }
}