public class ProdutorConsumidor {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        // Cria as threads do produtor e consumidor
        Produtor produtor = new Produtor(buffer);
        Consumidor consumidor = new Consumidor(buffer);

        // Inicia as threads
        produtor.start();
        consumidor.start();
    }
}
