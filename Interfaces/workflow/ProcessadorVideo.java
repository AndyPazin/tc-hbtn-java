import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    private List<CanalNotificacao> canais;

    public ProcessadorVideo() {
        canais = new ArrayList<>();
    }

    public void registrarCanal (CanalNotificacao canal){
        canais.add(canal);
    }

    public void processar (Video video){
        String msg = video.getArquivo() + " - " + video.getFormato();
        Mensagem mensagem = new Mensagem(msg, TipoMensagem.LOG);
        for (CanalNotificacao canal : canais) {
            canal.notificar(mensagem);
        }
    }
}
