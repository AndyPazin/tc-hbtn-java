public class Post implements Comparable<Post>{
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    // Getters para os atributos
    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    // Setters para os atributos (opcional, se precisar modificar os valores após a criação)
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public int compareTo(Post outroPost ) {
        int comparacaoTitulo = this.titulo.compareTo(outroPost.titulo);
        if (comparacaoTitulo != 0) {
            return comparacaoTitulo;
        } else {
            return this.autor.compareTo(outroPost.autor);
        }
    }
}