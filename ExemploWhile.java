public class ExemploWhile{
    public static void main(String args []) {
        
        int num = 5;

        int cont;

        cont = 1;
        while (cont <=10){
            System.out.printf("%d x %d = %d\n", num, cont, num*cont);
            cont++;
        }
    }
}