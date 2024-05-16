
public class Convidado {
    //atributos
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite){
        setCodigoConvite(codigoConvite);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }
    public int getCodigoConvite() {
        return codigoConvite;
    }
    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        
        return "Convidado{"+"nome='"+nome+'\''+", codigoConvite="+codigoConvite+'}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvite;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codigoConvite != other.codigoConvite)
            return false;
        return true;
    }

    

}