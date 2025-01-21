public class Email implements CanalNotificacao{
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.printf("[E-MAIL] {%s} - %s\n", mensagem.getTipoMensagem(), mensagem.getTexto());
    }
}
