public class ContarMaiores {


    /**
     * Método para contar quantos números em um array são maiores que um valor específico.
     * Complexidade de tempo: O(n) - onde n é o tamanho do array.
     * Complexidade de espaço: O(1) - usa espaço constante.
     *
     * @param numeros Array de inteiros.
     * @param valor   Valor para comparação.
     * @return Quantidade de números maiores que o valor.
     */
    public static int contarMaioresQue(int[] numeros, int valor) {
        if (numeros == null) {
            throw new IllegalArgumentException("O array não pode ser nulo.");
        }

        int contador = 0; // Inicializa o contador
        for (int numero : numeros) { // Itera por cada número no array
            if (numero > valor) { // Verifica se o número é maior que o valor
                contador++; // Incrementa o contador se for maior
            }
        }
        return contador; // Retorna a contagem final
    }


    public static void main(String[] args) {
        int[] numeros = {3, 10, 7, 25, 15, 2};
        int valor = 10;


        System.out.println("Array: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }


        System.out.println("\nNúmero de elementos maiores que " + valor + ": " + contarMaioresQue(numeros, valor));
    }
}
