package pessoas;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa();//entra no metodo vazio Pessoa(){}
		Pessoa maria = new Pessoa("Maria","RUA DAS MARIAS");
		//definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do marcos ?
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
        System.out.println(maria.getNome() + "-" + maria.getCpf());
    }
}
