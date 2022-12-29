import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        char resp;
        do{
        System.out.print("Digite a temperatura em Celsius: ");
        double c=ent.nextDouble();
        double f=9.0*c/5.0+32.0;
        System.out.printf("Equivalente em fahrenhit: %.1f%n",f);
        System.out.print("Deseja repetir (S/N) ? ");
        resp=ent.next().charAt(0);
        } while(resp !='n');
        System.out.println("Ate mais! ");
        ent.close();
    }
}
