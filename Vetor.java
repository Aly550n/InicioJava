import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
    
        int n = ent.nextInt();
        double[] vect = new double[n];

        for(int i=0; i<n;i++){
            vect[i]=ent.nextDouble();            
        }

        double sum=0.0;
        for(int i=0;i<0;i++){
            sum+= vect[i];
        }
        double avg = sum/n;
        System.out.println("Soma : "+sum);

        ent.close();
    }
    
}
