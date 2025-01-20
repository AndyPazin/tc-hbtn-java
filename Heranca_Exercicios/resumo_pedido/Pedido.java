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
        DecimalFormat df = new DecimalFormat("#,##0.00"); // Formatação para duas casas decimais

        System.out.println("------- RESUMO PEDIDO -------");

        double totalProdutos = 0;
        for (ItemPedido item : itens) {
            Produto produto = item.getProduto();
            double totalItem = item.getQuantidade() * produto.obterPrecoLiquido();
            totalProdutos += totalItem;

            System.out.println("Tipo: " + produto.getClass().getSimpleName() + // Obtém o nome da classe do produto
                    "  Titulo: " + produto.getTitulo() +
                    "  Preco: " + df.format(produto.obterPrecoLiquido()) +
                    "  Quant: " + item.getQuantidade() +
                    "  Total: " + df.format(totalItem));
        }

        System.out.println("----------------------------");
        System.out.println("DESCONTO: " + df.format(totalProdutos * (percentualDesconto/100)));
        System.out.println("TOTAL PRODUTOS: " + df.format(totalProdutos));
        System.out.println("----------------------------");
        System.out.println("TOTAL PEDIDO: " + df.format(calcularTotal()));
        System.out.println("---------------------------");
    }
}
