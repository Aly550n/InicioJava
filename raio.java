import java.util.Scanner;

public class raio {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
         
         System.out.println("Enter radius: ");
         double radius = ent.nextDouble();

         double c = raio2.circumference(radius);
         double v = raio2.volume(radius);

         System.out.printf("Circumference: %.2f%n",c);
         System.out.printf("Volume: %.2f%n",v);
         System.out.printf("PI value: %.2f%n",raio2.PI);


         ent.close();
    }
}
