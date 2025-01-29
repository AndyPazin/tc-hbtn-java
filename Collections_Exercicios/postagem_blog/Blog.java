import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem) {
        for (Post p : this.postagens) {
            if (postagem.compareTo(p) == 0) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        this.postagens.add(postagem);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post postagem : this.postagens) {
            autores.add(postagem.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new HashMap<>();
        for (Post postagem : this.postagens) {
            Categorias categoria = postagem.getCategoria();
            contagem.put(categoria, contagem.getOrDefault(categoria, 0) + 1);
        }
        return contagem;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> posts = new TreeSet<>();
        for (Post postagem : this.postagens) {
            if (postagem.getAutor().equals(autor)) {
                posts.add(postagem);
            }
        }
        return posts;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> posts = new TreeSet<>();
        for (Post postagem : this.postagens) {
            if (postagem.getCategoria().equals(categoria)) {
                posts.add(postagem);
            }
        }
        return posts;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postsPorCategoria = new HashMap<>();
        for (Post postagem : this.postagens) {
            Categorias categoria = postagem.getCategoria();
            postsPorCategoria.computeIfAbsent(categoria, k -> new TreeSet<>()).add(postagem);
        }
        return postsPorCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> postsPorAutor = new HashMap<>();
        for (Post postagem : this.postagens) {
            Autor autor = postagem.getAutor();
            postsPorAutor.computeIfAbsent(autor, k -> new TreeSet<>()).add(postagem);
        }
        return postsPorAutor;
    }

}