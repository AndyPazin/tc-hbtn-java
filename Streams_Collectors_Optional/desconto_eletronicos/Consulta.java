import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        List<Produto> produtosDoPedido = pedido.getProdutos();
        List<Produto> livrosDoPedido = new ArrayList<>();

        for (Produto produto : produtosDoPedido) {
            if (produto.getCategoria() == CategoriaProduto.LIVRO) {
                livrosDoPedido.add(produto);
            }
        }

        return livrosDoPedido;
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        if (produtos == null || produtos.isEmpty()) {
            return null; // Ou lançar uma exceção, dependendo do caso
        }

        return produtos.stream()
                .max(Comparator.comparing(Produto::getPreco))
                .orElse(null); // Retorna null se a lista estiver vazia
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
        List<Produto> produtosFiltrados = new ArrayList<>();

        for (Produto produto : produtos) {
            if (produto.getPreco() >= precoMinimo) {
                produtosFiltrados.add(produto);
            }
        }

        return produtosFiltrados;
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        List<Pedido> pedidosComEletronicos = new ArrayList<>();

        for (Pedido pedido : pedidos) {
            if (pedido.getProdutos().stream().anyMatch(produto -> produto.getCategoria() == CategoriaProduto.ELETRONICO)) {
                pedidosComEletronicos.add(pedido);
            }
        }

        return pedidosComEletronicos;
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos.stream()
                .map(produto -> {
                    if (produto.getCategoria() == CategoriaProduto.ELETRONICO) {
                        double precoComDesconto = produto.getPreco() * 0.85;
                        produto.setPreco(precoComDesconto);
                    }
                    return produto;
                })
                .collect(Collectors.toList());
    }
}