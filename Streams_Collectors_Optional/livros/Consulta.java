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
}