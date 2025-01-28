public class ArmazemDeEletronico<T extends Eletronico> extends Armazem<T>{
    @Override
    public void adicionarAoInventario(String nome, T item) {
        inventario.put(nome, item);
    }

    @Override
    public T obterDoInventario(String nome) {
        return inventario.get(nome);
    }
}
