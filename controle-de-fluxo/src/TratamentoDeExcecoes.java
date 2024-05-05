//possiveis erros
//valor altura ter uma virgula no lugar de ponto
// não informar o nome e sobrenome
//valor de identidade ter um caracter não numérico

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class TratamentoDeExcecoes {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
            System.out.println("Digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        } catch (InputMismatchException e) {//executa se houver um erro com relaçao ao input no bloco try
            System.err.println("Os campos idade e altura precisão ser numéricos!");
        }
    }
}
