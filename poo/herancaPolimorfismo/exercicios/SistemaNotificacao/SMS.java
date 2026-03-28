package poo.herancaPolimorfismo.exercicios.SistemaNotificacao;

public class SMS extends Notificacao{
    public SMS(String detinatario, String mensagem) {
        super(detinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.printf("Enviando SMS para: %s\nMensagem: %s", getDestinatario(), getMensagem());
    }
}
