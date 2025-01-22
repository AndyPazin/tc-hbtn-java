import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {

    protected String titulo;
    protected String autor;
    protected double preco;

    public Livro() {
    }

    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo)throws LivroInvalidoException {
        if (titulo == null || titulo.length() < 3) {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws AutorInvalidoException {
//        if (autor == null || autor.isBlank()) {
//            throw new AutorInvalidoException("Nome do autor não pode ser nulo ou vazio");
//        }
        if (autor.split("\\s+").length < 2) { // Verifica se há pelo menos dois nomes
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco)throws LivroInvalidoException {
        if (preco <= 0) {
            throw new LivroInvalidoException("Preco de livro invalido");
        }
        this.preco = preco;
    }
}
