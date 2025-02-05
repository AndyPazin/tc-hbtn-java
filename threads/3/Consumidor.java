public class Consumidor extends Thread {
    private Fila fila;

    public Consumidor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = this.fila.retirar();
                System.out.println("Consumidor processou: " + item);
                Thread.sleep(500); // Simula processamento
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}