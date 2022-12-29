import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a=ent.nextInt();
        int b=ent.nextInt();
        int c=ent.nextInt();

        int higher = max(a,b,c);

        showResult(higher);
               
        ent.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if(x>y&&x>z){
            aux =x;
        }else if(y>z){
            aux = y;
        }else{
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher= "+value);
    }

}
