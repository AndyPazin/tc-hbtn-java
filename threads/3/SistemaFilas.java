public class SistemaFilas {
    public static void main(String[] args) throws InterruptedException {
        Fila fila = new Fila(10); // Cria fila com capacidade 10

        // Cria threads de produtores e consumidores
        Produtor produtor1 = new Produtor(fila);
        Produtor produtor2 = new Produtor(fila);
        Consumidor consumidor1 = new Consumidor(fila);
        Consumidor consumidor2 = new Consumidor(fila);

        // Inicia as threads
        produtor1.start();
        produtor2.start();
        consumidor1.start();
        consumidor2.start();

        // Executa por 20 segundos e encerra o programa
        Thread.sleep(20000);
        System.exit(0);
    }
}