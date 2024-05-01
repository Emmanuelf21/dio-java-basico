import java.util.Scanner;
import java.util.Locale;

public class LeitorEntradasScanner {
    public static void main(String[] args) {
        //locale define o valor de medida americano
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome: ");
        String nome= scanner.next();
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome= scanner.next();
        
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura);
    }
}
