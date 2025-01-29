import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private ArrayList<PedidoCookie> cookies;

    // Construtor
    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        this.cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int totalCaixas = 0;
        for (PedidoCookie cookie : this.cookies) {
            totalCaixas += cookie.getQuantidadeCaixas();
        }
        return totalCaixas;
    }

    public int removerSabor(String sabor) {
        int totalCaixasRemovidas = 0;
        List<PedidoCookie> cookiesToRemove = new ArrayList<>();

        for (PedidoCookie cookie : this.cookies) {
            if (cookie.getSabor().equals(sabor)) {
                totalCaixasRemovidas += cookie.getQuantidadeCaixas();
                cookiesToRemove.add(cookie);
            }
        }

        this.cookies.removeAll(cookiesToRemove);

        return totalCaixasRemovidas;
    }

    }