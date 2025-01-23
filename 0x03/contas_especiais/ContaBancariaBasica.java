import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.setNumeracao(numeracao);
        this.setTaxaJurosAnual(taxaJurosAnual);
        this.setSaldo(0);
    }

    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
        if (valor > this.saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        this.saldo -= valor;
    }

    public double calcularTarifaMensal() {
        double tarifaPorcentagem = this.saldo * 0.10;
        if(tarifaPorcentagem < 10){
            return tarifaPorcentagem;
        } else {
            return 10.00;
        }
    }

    public double calcularJurosMensal() {
        if (this.saldo > 0) {
            return this.saldo * ((this.taxaJurosAnual / 12)/100);
        } else {
            return 0;
        }
    }

    public void aplicarAtualizacaoMensal() {
        double tarifa = calcularTarifaMensal();
        double juros = calcularJurosMensal();
        this.saldo -= tarifa;
        this.saldo += juros;
    }
}

