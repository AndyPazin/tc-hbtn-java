import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

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
}