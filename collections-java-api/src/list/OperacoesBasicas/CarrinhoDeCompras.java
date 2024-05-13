package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        if (!carrinho.isEmpty()) {
            List<Item> itemsParaRemover = new ArrayList<>();

            for (Item i : carrinho) {
                if (i.getNome().equalsIgnoreCase(nome)){
                    itemsParaRemover.add(i);
                }
            }

            carrinho.removeAll(itemsParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        if (!carrinho.isEmpty()) {
            for (Item i : carrinho){
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }

            return valorTotal;
        } else {
            throw new RuntimeException("O carrinho está vazio");
          }
    }

    public void exibirItens() {
        if (!carrinho.isEmpty()) {
            System.out.println(this.carrinho);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [carrinho=" + carrinho + "]";
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
