package domain;

public class Cliente {
    private final String id;
    private final String nome;

    public Cliente(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters
    public String getId() { return id; }
    public String getNome() { return nome; }
}