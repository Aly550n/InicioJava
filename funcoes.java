public class funcoes {
    public static void main(String[] args) {
        
        String original = "ALYSSON mendes MOTA";

        String s01 = original.toLowerCase();//todas as letras minusculas
        String s02 = original.toUpperCase();//todas as letras maiusculas
        String s03 = original.trim();//tira os espaços no inicio e final
        String s04 = original.substring(2,9);//de onde deve iniciar e onde deve finalizar
        String s05 = original.substring(2);//de onde iniciar
        String s06 = original.replace('A','x');//trocar um valor por outro
        String s07 = original.replace("ALYSSON", "XUXUZEIRA");//troca de um valor inteiro
        int i = original.indexOf("A");//primeira ocorrencia do valor
        int j = original.lastIndexOf("A");//ultima ocorrencia do valor

        System.out.println("original: -"+original+"-");
        System.out.println("toLower: -"+s01+"-");
        System.out.println("toUpperCase: -"+s02+"-");
        System.out.println("Trim: -"+s03+"-");
        System.out.println("substring: -"+s04+"-");
        System.out.println("substring 2: -"+s05+"-");
        System.out.println("replace: -"+s06+"-");
        System.out.println("replace 2: -"+s07+"-");
        System.out.println("indexOF: -"+i+"-");
        System.out.println("lastIndexOF: -"+j+"-");
    }
    
}
