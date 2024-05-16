package set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean concluido;

    public Tarefa(String descricao){
        setConcluido(false);
        setDescricao(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public boolean isConcluido(){
        return concluido;
    }

    @Override
    public String toString() {
        return "Tarefa{"+"Descrição='"+descricao+'\''+", Concluido="+concluido+'}';
    }
    
}
