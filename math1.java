public class math1 {
    public static void main(String[] args) {
        double x= 3.0;
        double y = 4.0;
        double z = -5.0;
        double a, b, c;
        
        a=Math.sqrt(x);
        b=Math.sqrt(y);
        c=Math.sqrt(25.9);
        System.out.println("Raiz quadrade de "+x+" = "+a);
        System.out.println("Raiz quadrade de "+ y+" = "+b);
        System.out.println("Raiz quadrade de 25 = "+c);

        a= Math.pow(x, y);
        a= Math.pow(x, 2.0);
        a= Math.pow( 5.0, 2.0);
        System.out.println(x+" elevado a "+y+" = "+a);
        System.out.println(x+" elevado ao quadrado = "+ b);
        System.out.println("5 elevado ao qudrado = "+c);

        a=Math.abs(y);
        b=Math.abs(z);
        System.out.println("O valor absoluto de "+y+" = "+a);
        System.out.println("O valor absoluto de "+x+" = "+b);
    }
    
}
