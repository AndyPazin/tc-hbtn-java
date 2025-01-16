public class PersonagemGame {

        private int saudeAtual;
        private String nome;

        public int getSaudeAtual() {
                return saudeAtual;
        }

        public void setSaudeAtual(int saudeAtual) {
                this.saudeAtual = saudeAtual;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        // Método para diminuir a saúde do personagem
        public void tomarDano(int quantidadeDeDano) {
                if (quantidadeDeDano > 0) { // Evita dano negativo
                        this.saudeAtual -= quantidadeDeDano;
                        if (this.saudeAtual < 0) {
                                this.saudeAtual = 0; // Impede que a saúde fique negativa
                        }
                }
        }

        // Método para aumentar a saúde do personagem
        public void receberCura(int quantidadeDeCura) {
                if (quantidadeDeCura > 0) { // Evita cura negativa
                        this.saudeAtual += quantidadeDeCura;
                        if (this.saudeAtual >= 100) {
                                this.saudeAtual = 100; // Impede que a saúde fique negativa
                        }
                }
        }

}
