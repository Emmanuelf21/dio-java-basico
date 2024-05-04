import java.util.concurrent.ThreadLocalRandom;

/**
 * Repeticoes
 */
public class Repeticoes {

    public static void main(String[] args) {
        int numero = 5;
        for(int i=0;i<10;i++){
            numero+=2;
        }
        System.out.println(numero);

        //for em arrays

        String alunos []= {"Felipe","João", "Maria"};
        for(int i=0; i<alunos.length; i++){
            System.out.println(alunos[i]);
        }

        System.out.println("\n");
        //foreach
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        //break e continue
        int numeros [] = new int[25];
        int aux=0;
        for(int i=0;i<40;i++){
            if(i%2==0){
                continue; //ignora os números pares
            }
            else if(i==35){
                break; //para o loop quando chega no 35
            }
            else{//armazena os números impares
                numeros[aux] = i;
                aux++;
            }
        }
        for (int numero_aux : numeros) {
            if (numero_aux != 0)
                System.out.println(numero_aux);
        }

        //while e do while
        double mesada = 20;
        while (mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce>mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: "+valorDoce);
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: "+mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");

        boolean verificacao = true;
        int num_aux = 0;
        //do executa a primeira vez sem fazer a verificação da condição
        do{
            if (num_aux!=13)
                System.out.println(num_aux);
            else
                verificacao = false;
            
            num_aux++;

        }while (verificacao);
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);//valor aleatório de 2 à 8
    }

    
}