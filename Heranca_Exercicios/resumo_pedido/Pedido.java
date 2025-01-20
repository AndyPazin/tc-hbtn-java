import produtos.Produto;

import java.text.DecimalFormat;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido itens[];

    public Pedido() {
    }

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public double calcularTotal() {
        double totalItens = 0;
        for (ItemPedido item : itens) {
            totalItens += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }
        return totalItens * (1 - (percentualDesconto)/100); // Aplica o desconto
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");

        double totalProdutos = 0;
        for (ItemPedido item : itens) {
            Produto produto = item.getProduto();
            double totalItem = item.getQuantidade() * produto.obterPrecoLiquido();
            totalProdutos += totalItem;

            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f%n", // Usando printf
                    produto.getClass().getSimpleName(),
                    produto.getTitulo(),
                    produto.obterPrecoLiquido(),
                    item.getQuantidade(),
                    totalItem);
        }

        System.out.println("-----------------------------");
        System.out.printf("DESCONTO: %.2f%n", totalProdutos * (percentualDesconto/100)); // Usando printf
        System.out.printf("TOTAL PRODUTOS: %.2f%n", totalProdutos); // Usando printf
        System.out.println("-----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f%n", calcularTotal()); // Usando printf
        System.out.println("-----------------------------");
    }
}
