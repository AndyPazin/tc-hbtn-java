import java.util.Random;

public class Produtor extends Thread {
    private Fila fila;
    private Random random;

    public Produtor(Fila fila) {
        this.fila = fila;
        this.random = new Random();
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = random.nextInt(100) + 1; // Gera número aleatório entre 1 e 100
                this.fila.adicionar(item);
                Thread.sleep(1000); // Espera 1 segundo
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
