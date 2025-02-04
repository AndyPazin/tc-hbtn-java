public class Principal {
    public static void main(String[] args) {
        // Instancia o contador
        Contador contador = new Contador();

        // Cria as duas threads
        ThreadContador thread1 = new ThreadContador(contador);
        ThreadContador thread2 = new ThreadContador(contador);

        // Inicia as threads
        thread1.start();
        thread2.start();

        // Espera as threads terminarem
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Imprime o valor final do contador
        System.out.println("Valor final do contador: " + contador.getContagem());
    }
}
