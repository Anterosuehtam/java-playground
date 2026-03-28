package poo.herancaPolimorfismo.exercicios.SistemaNotificacao;

public class Email extends Notificacao{
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        this.assunto = assunto;
        super(destinatario, mensagem);
    }

    @Override
    public void enviar(){
        System.out.printf("Enviando um E-mail para: %s\nAssunto: %s\nCorpo: %s", getDestinatario(), assunto, getMensagem());
    }
}
