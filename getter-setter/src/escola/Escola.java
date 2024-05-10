package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno maria = new Aluno();
        maria.setNome("Maria");
        maria.setIdade(17);

        System.out.println("O(A) Aluno(a) "+ maria.getNome() + " tem "+ maria.getIdade()+ " anos.");
    }
}
