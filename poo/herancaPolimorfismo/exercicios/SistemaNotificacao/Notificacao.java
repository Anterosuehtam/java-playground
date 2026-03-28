package poo.herancaPolimorfismo.exercicios.SistemaNotificacao;

public class Notificacao {
    private String destinatario;

    private String mensagem;

    public Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void enviar() {
        System.out.printf("Enviando uma notificação para %s\nAssunto: %s", destinatario, mensagem);
    }
}
