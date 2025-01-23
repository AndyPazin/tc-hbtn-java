import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica{
    private int quantidadeTransacoes;
    private final double TARIFA = 0.10;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = 0;
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor+TARIFA);
        this.quantidadeTransacoes++;

    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor - TARIFA);
    }
}
