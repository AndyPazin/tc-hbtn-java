public class ArmazemDeComida<T extends Comida> extends Armazem<T>{
    @Override
    public void adicionarAoInventario(String nome, T item) {
        inventario.put(nome, item);
    }

    @Override
    public T obterDoInventario(String nome) {
        return inventario.get(nome);
    }
}
