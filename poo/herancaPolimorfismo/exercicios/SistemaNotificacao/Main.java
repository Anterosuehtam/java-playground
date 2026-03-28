package poo.herancaPolimorfismo.exercicios.SistemaNotificacao;
/*Você está desenvolvendo um sistema de comunicação para uma plataforma que precisa
enviar alertas aos usuários de diferentes formas. Cada tipo de notificação tem suas
particularidades: um e-mail exige um assunto e um corpo, um SMS somente o texto da
mensagem, e uma notificação push deve conter um título e uma mensagem de texto.

Crie um programa que:

- Defina uma classe base Notificacao com atributos destinatário e mensagem.
Crie classes específicas (Email, SMS, Push) que herdem de Notificacao.
Cada uma deve implementar o seu próprio metodo enviar(), exibindo como cada
notificação é disparada. Lembre-se de sobrescrever o metodo utilizando a anotação @override.

*/
public class Main {
    static void main(String[] args) {
        Notificacao notificacao = new Notificacao("Matheus", "Seja bem vindo ao itaú, ficamos contentes em vê-lo fazendo parte do time!");
        Email email = new Email("cliente@exemplo","Aproveite nossos descontos essa semana.", "Promoção especial!");
        SMS sms = new SMS("(11) 98765-4321", "Sua fatura foi paga com sucesso.");
        Push push = new Push("usuario_app","Você tem uma nova mensagem não lida.", "Novidade!");

        notificacao.enviar();
        System.out.println("\n");
        email.enviar();
        System.out.println("\n");
        sms.enviar();
        System.out.println("\n");
        push.enviar();
    }
}
