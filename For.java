import java.util.Scanner;

public class For {
    public static void main (String[]args){
        Scanner ent = new Scanner (System.in);

        System.out.print("Digite a quantidade de numeros: ");
        int x = ent.nextInt();

        int soma =0;
        for(int i=0;i<x;i++){
            System.out.print("Digite-o: ");
            int y = ent.nextInt();
            soma = soma+y;

        }
        System.out.printf("A quantide de numeros escolhida foi de %d e a soma deles sao %d !",x,soma);

        ent.close();
    }
    
}
