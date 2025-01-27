public class Complexidade {
    public static int encontrarMaior(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("O array não pode ser nulo ou vazio.");
        }

        int maior = numeros[0]; // Inicializa com o primeiro elemento
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 5, 15, 30};

        int soma = AlgoritmoExemplo.calcularSoma(numeros);
        System.out.println("Soma dos elementos: " + soma);

        int maior = Complexidade.encontrarMaior(numeros);
        System.out.println("Maior elemento: " + maior);
    }

}
