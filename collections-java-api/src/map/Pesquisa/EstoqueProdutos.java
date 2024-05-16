package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    
    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque+= (p.getPreco()*p.getQuantidade());
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto prodMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        for (Produto p : estoqueProdutosMap.values()) {
            if (maiorPreco<=p.getPreco()) {
                prodMaisCaro = p;
                maiorPreco = p.getPreco();
            }
        }
        return prodMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto prodMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        for (Produto p : estoqueProdutosMap.values()) {
            if (menorPreco>=p.getPreco()) {
                prodMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        return prodMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto prodMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutosEmEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()){
                double valorProdutosEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if(valorProdutosEmEstoque>maiorValorTotalProdutosEmEstoque){
                    maiorValorTotalProdutosEmEstoque = valorProdutosEmEstoque;
                    prodMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return prodMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calculaValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
