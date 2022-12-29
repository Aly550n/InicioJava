import java.util.Scanner;

public class triangle {
    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner (System.in);

        triangle2 x, y;
        x= new triangle2();
        y= new triangle2();
        
        System.out.println("Entre com as medidas do triangulo X");
        x.a=ent.nextDouble();
        x.b=ent.nextDouble();
        x.c=ent.nextDouble();
        System.out.println("Entre com as medidas do triangulo Y");
        y.a=ent.nextDouble();
        y.b=ent.nextDouble();
        y.c=ent.nextDouble();

        double p= (x.a+x.b+x.c)/2.0;
        double areaX = Math.sqrt(p*(p-y.a)*(p-y.b*(p-y.c)));

        p = (y.a+y.b+y.c)/2.0;
        double areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));

        System.out.printf("triangulo X area: %.4f%n",areaX);
        System.out.printf("triangulo Y area: %.4f%n",areaY);





    }
}
