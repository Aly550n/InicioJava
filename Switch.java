import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        int x = ent.nextInt();
        
        String dia;

        switch(x){
            case 1:
                dia="DDomingo";
            break;
            case 2:
                dia="Segunda";
            break;
            case 3:
                dia="Terça";
            break;
            case 4:
                dia="Quarta";
            break;
            case 5:
                dia="Quinta";
            break;
            case 6:
                dia="Sexta";
            break;
            case 7:
                dia="Sabado";
            break;
            default:
                dia="Valor errado";
            break;
        }
        System.out.println("O dia da semana e: " + dia);



    }
}
