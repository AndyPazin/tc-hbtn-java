public class PessoasArray {

    private String[] nomes;

    public PessoasArray() {
        nomes =new String[]{"Amanda", "Beatriz", "Carlos","Daniela","Eduardo",
                "Fabio","Gustavo", "Hingrid","Isabela","Joao","Leise","Maria",
                "Norberto","Otavio","Paulo", "Quirino","Renata","Sabata",
                "Tais","Umberto","Vanessa","Xavier"};
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    // implementar o método de buscaBinaria
    public void buscaBinaria(String nome){
        int inicio = 0;
        int fim = nomes.length - 1;
        boolean encontrado = false;
        System.out.println("Procurando o nome: \""+nome +"\"");
        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2; // Evita overflow
            int comparacao = nomes[meio].compareTo(nome);
            System.out.println("Passando pelo indice: "+ meio);
            if (comparacao == 0) {
                encontrado = true;
                System.out.println("Nome " + nome + " encontrado na posição " + meio);
                break; // Sai do loop quando encontra o nome
            } else if (comparacao < 0) {
                inicio = meio + 1; // Busca na metade direita
            } else {
                fim = meio - 1; // Busca na metade esquerda
            }
        }

        if (!encontrado) {
            throw new IllegalArgumentException("O nome " + nome + " não se encontra no array de nomes");
        }

    }
}


