
public class Operadores {

    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        
        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1;
        
        System.out.println(concatenacao);
        
        concatenacao = (1+1+1)+"1";
        
        System.out.println(concatenacao);

        int numero = 5;
        System.out.println(-numero);
        System.out.println(numero);
        System.out.println(++numero);
        System.out.println(--numero);
    }
}