public class SimulacaoTarefas {


    // Função para contar até N de forma sequencial (sem threads)
    public static void contarSequencialmente(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Contando: " + i);
            try {
                Thread.sleep(10); // Simula um tempo de execução para cada tarefa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    // Função para contar até N com múltiplas threads
    public static void contarComThreads(int n, int numThreads) throws InterruptedException {
        int intervalo = n / numThreads;
        Thread[] threads = new Thread[numThreads];


        // Cria as threads para contar até N
        for (int i = 0; i < numThreads; i++) {
            final int inicio = i * intervalo + 1;
            final int fim = (i == numThreads - 1) ? n : (i + 1) * intervalo;
            threads[i] = new Thread(() -> {
                for (int j = inicio; j <= fim; j++) {
                    System.out.println("Contando: " + j);
                    try {
                        Thread.sleep(10); // Simula um tempo de execução para cada tarefa
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            threads[i].start();
        }


        // Aguarda todas as threads terminarem
        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        int n = 100;  // Número até o qual vamos contar
        int numThreads = 4; // Número de threads a serem usadas para a contagem


        // Medindo o tempo de execução sem threads
        long inicio = System.nanoTime();
        System.out.println("Contagem sem threads:");
        contarSequencialmente(n);
        long fim = System.nanoTime();
        long tempoSequencial = fim - inicio;


        // Medindo o tempo de execução com threads
        inicio = System.nanoTime();
        System.out.println("\nContagem com threads:");
        contarComThreads(n, numThreads);
        fim = System.nanoTime();
        long tempoComThreads = fim - inicio;


        // Exibindo os resultados
        System.out.println("\nTempo de execução (sem threads): " + tempoSequencial + " nanosegundos");
        System.out.println("Tempo de execução (com threads): " + tempoComThreads + " nanosegundos");
    }
}