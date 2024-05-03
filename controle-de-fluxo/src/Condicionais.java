import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 25.0;
        double valorSolicitado = 27.0;

        System.out.println("\nDigite um numero de 0 à 3: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 0:
                //condição simples
                if(valorSolicitado < saldo){
                    saldo = saldo - valorSolicitado;
                }
                System.out.println(saldo);
                break;

            //---------------------------------------------------------//

            case 1:
                //condição composta
                int nota1 = 8;
                if (nota1>=6) System.out.println("Aprovado!");
                else System.out.println("Reprovado!");
                break;
            
            //---------------------------------------------------------//

            case 2:
                //condição ternária
                int nota2 = 4;
                String resp = nota2>=6 ? "aprovado" : "reprovado";
                System.out.println(resp);
                break;
            
            //---------------------------------------------------------//

            case 3:
                //condiçaõ encadeada
                int nota3 = 8;
                if(nota3>=7)
                    System.out.println("APROVADO");

                else if(nota3>=5 && nota3<7)
                    System.out.println("Prova Recuperação");

                else System.out.println("REPROVADO");
                break;
        }
    }
}
