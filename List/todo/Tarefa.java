public class Tarefa {

    private String descricao;
    private boolean estahFeita;
    private int identificador;

    // Construtor
    public Tarefa(String descricao, int identificador) {
        this.modificarDescricao(descricao);
        this.identificador = identificador;
        this.estahFeita = false; // Tarefa inicia como não feita
    }

    // Métodos acessores (getters)
    public String getDescricao() {
        return this.descricao;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public boolean isEstahFeita() {
        return this.estahFeita;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    // Método modificador para descricao
    public void modificarDescricao(String novaDescricao) {
        if (novaDescricao == null || novaDescricao.isEmpty()) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
        this.descricao = novaDescricao;
    }


}