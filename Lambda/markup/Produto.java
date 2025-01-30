import java.util.function.Supplier;
import java.util.function.Consumer;

public class Produto {
    private double preco;
    private String nome;
    private double percentualMarkup = 10.0;

    public Supplier<Double> precoComMarkup = () -> preco * (1 + percentualMarkup / 100);
    public Consumer<Double> atualizarMarkup = novoMarkup -> percentualMarkup = novoMarkup;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }
}