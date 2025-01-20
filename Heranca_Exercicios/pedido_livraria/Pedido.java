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
}
