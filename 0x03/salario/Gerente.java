public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    public double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta()){
            double diferenca =  departamento.getValorAtingidoMeta() - departamento.getValorMeta();
            return (getSalarioFixo()*0.20) + (diferenca * 0.01);
        } else {
            return 0.0;
        }
    }
}
