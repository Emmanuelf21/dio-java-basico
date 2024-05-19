package Lamba_Expression;

import java.util.ArrayList;
import java.util.List;
public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public List<Pessoa> ordenarPorAltura(){
        if(!pessoaList.isEmpty()){
            List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
            //lambda expression
            pessoaPorAltura.sort((p1,p2) -> Double.compare(p1.getAltura(),p2.getAltura()));
            return pessoaPorAltura;
        }
        else{
            throw new RuntimeException("A lista está vazia");
        }
    }
}
