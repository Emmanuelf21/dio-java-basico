package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // analisarCandidato(1900.0);
        // analisarCandidato(2000.0);
        // analisarCandidato(2500.0);

        //selecaoCandidatos();

        //imprimirSelecionados();
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato : candidatos) {
            entrandoContato(candidato);
        }
    }
    
    static void entrandoContato(String candidato){
        int tentativas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuaTentando = !atendeu;//se atendeu for false, continuaTentando será true

            if(continuaTentando)
				tentativas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuaTentando && tentativas<3);

        if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +
            " NA " + tentativas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " +
             candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativas + " REALIZADA");
		
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo candidatos selecionados!");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de nº"+(i+1)+ " é o "+ candidatos[i]);
        }

    }

    static void selecaoCandidatos(){//seleção de candidatos por salário
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual=0;
        double salarioBase=2000.0;

        while (candidatosSelecionados<5 && candidatoAtual<candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido =  valorPretendido();

            System.out.println("O candidato "+ candidato +". Solicitou este valor de salário R$"+ salarioPretendido);
            
            if(salarioBase>=salarioPretendido){
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }   
        System.out.println("Quantidade de candidatos selecionados: " + candidatosSelecionados);
    }


    static double valorPretendido() {//gera um valor aleatório entre 1800 e 2200
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;//retorna True se o valor entre 1 e 3 for 1
	}

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO!");
        }
        else if(salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA!");
        }
        else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS!");
        }
    }
}
