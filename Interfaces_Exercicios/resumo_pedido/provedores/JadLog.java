package provedores;

public class JadLog implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete =0.0;
        if(peso > 2000){
            valorFrete = valor * 0.07;
        } else {
            valorFrete = valor * 0.045;
        }
        return new Frete(valorFrete, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
