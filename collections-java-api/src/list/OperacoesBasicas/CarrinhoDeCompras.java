package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> items;
    
    public CarrinhoDeCompras(){
        items = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        items.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item item : items) {
            if(item.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(item);
            }
        }
        items.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item item : items) {
            valorTotal += (item.getPreco()*item.getQuantidade());
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(items);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("refrigerante", 4.75, 3);
        carrinho.adicionarItem("feijão", 2.75, 2);
        carrinho.adicionarItem("Arroz", 3.25, 1);

        System.out.println("O valor total da compra é: R$"+carrinho.calcularValorTotal());

        carrinho.removerItem("refrigerante");
        carrinho.exibirItens();
    }
}