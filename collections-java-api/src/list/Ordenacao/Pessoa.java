package list.Ordenacao;

public class Pessoa implements Comparable<Pessoa>{
    //atributos 
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura){
        setAltura(altura);
        setIdade(idade);
        setNome(nome);
    }
    
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(this.idade, p.getIdade());
    }

    public void setAltura(double altura) {
        this.altura = altura;
    } 

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{Nome='"+nome+'\''+", Idade="+idade+", Altura="+altura+'}';
    }
}
