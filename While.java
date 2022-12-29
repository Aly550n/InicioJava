import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite a senha numerica :  ");
        int x=ent.nextInt();

        while (x != 122 ) { 
            System.out.print("Senha incorreta tente novemente: ");
            x=ent.nextInt();
        }

        System.out.println("ACESSO CONCEDIDO!");





        ent.close();
    }
    
}
