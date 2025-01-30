import java.util.List;
import java.util.ArrayList;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterio) {
        List<Produto> produtosFiltrados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (criterio.testar(produto)) {
                produtosFiltrados.add(produto);
            }
        }
        return produtosFiltrados;
    }
}