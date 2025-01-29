public class PedidoCookie {

    private String sabor;
    private int quantidadeCaixas;

    // Construtor
    public PedidoCookie(String sabor, int quantidadeCaixas) {
        this.sabor = sabor;
        this.quantidadeCaixas = quantidadeCaixas;
    }

    // Métodos acessores (getters)
    public String getSabor() {
        return this.sabor;
    }

    public int getQuantidadeCaixas() {
        return this.quantidadeCaixas;
    }

    // Métodos modificadores (setters) - Opcional, se precisar alterar os valores depois da criação
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setQuantidadeCaixas(int quantidadeCaixas) {
        this.quantidadeCaixas = quantidadeCaixas;
    }

}