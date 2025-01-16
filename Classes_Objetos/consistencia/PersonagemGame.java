public class PersonagemGame {

        private int saudeAtual;
        private String nome;
        private String status;


        public PersonagemGame() {
        }

        public PersonagemGame(int saudeAtual, String nome) {
                this.setSaudeAtual(saudeAtual);
                this.setNome(nome);
        }

        public int getSaudeAtual() {
                return saudeAtual;
        }

        public void setSaudeAtual(int saudeAtual) {
                this.saudeAtual = saudeAtual;
                if(this.saudeAtual > 0){
                        this.status="vivo";
                } else {
                        this.status="morto";
                }
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                if (nome != null && !nome.isEmpty()) { // Verifica se nome não é nulo e nem vazio
                        this.nome = nome;
                } else {
                        System.out.println("Nome inválido. Mantendo o nome anterior: " + this.nome);
                }
        }

        public String getStatus() {
                return status;
        }

        // Método para diminuir a saúde do personagem
        public void tomarDano(int quantidadeDeDano) {
                if (quantidadeDeDano > 0) { // Evita dano negativo
                        this.setSaudeAtual(this.getSaudeAtual() - quantidadeDeDano);
                        if (this.getSaudeAtual() < 0) {
                                this.setSaudeAtual(0); // Impede que a saúde fique negativa
                        }
                }
        }

        // Método para aumentar a saúde do personagem
        public void receberCura(int quantidadeDeCura) {
                if (quantidadeDeCura > 0) { // Evita cura negativa
                        this.setSaudeAtual(this.getSaudeAtual() + quantidadeDeCura);;
                        if (this.getSaudeAtual() >= 100) {
                                this.setSaudeAtual(100); // Impede que a saúde fique negativa
                        }
                }
        }

}
