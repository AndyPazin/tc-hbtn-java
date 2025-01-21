import atividade.Atividade;
import p2575.CanalNotificacao;

public class MaquinaWorkflow {

    public void executar(Workflow workflow){
        for (Atividade atividade : workflow.getAtividades()) {
            atividade.executar();
        }
    }
}
