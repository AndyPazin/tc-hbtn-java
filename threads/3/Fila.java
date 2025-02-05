import java.util.LinkedList;

public class Fila {
    private LinkedList<Integer> fila;
    private int capacidade;

    public Fila(int capacidade) {
        this.fila = new LinkedList<>();
        this.capacidade = capacidade;
    }

    public synchronized void adicionar(int item) throws InterruptedException {
        while (this.fila.size() == this.capacidade) {
            wait(); // Espera se a fila estiver cheia
        }
        this.fila.add(item);
        System.out.println("Produtor adicionou: " + item);
        notifyAll(); // Notifica os consumidores que a fila não está vazia
    }

    public synchronized int retirar() throws InterruptedException {
        while (this.fila.isEmpty()) {
            wait(); // Espera se a fila estiver vazia
        }
        int item = this.fila.remove();
        System.out.println("Consumidor retirou: " + item);
        notifyAll(); // Notifica os produtores que a fila não está cheia
        return item;
    }
}
