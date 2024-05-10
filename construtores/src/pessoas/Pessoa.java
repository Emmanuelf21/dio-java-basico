package pessoas;
public class Pessoa {
    private String nome;
	private String cpf;
	private String endereco;
	
    public Pessoa(){}
    //construcor que recebe nome e cpf para setar
    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
