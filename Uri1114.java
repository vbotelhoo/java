import java.util.Scanner;
public class Uri1114 {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);

        int senha;
        
        do{
            senha = x.nextInt();
            if(senha == 2002){
                break;
            }
            else{
                System.out.println("Senha Invalida");
            } 
        } while (senha != 2002);
        System.out.println("Acesso Permitido");
    }
}