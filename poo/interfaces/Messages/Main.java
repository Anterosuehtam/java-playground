package poo.interfaces.Messages;

import java.util.List;

public class Main {
    static void main(String[] args) {
        String mensagemMarketing = "Promoção de 50% de desconto!";
        List<SendMessage> servicos = List.of(new Sms(),
                new Email(),
                new WhatsApp(),
                new SocialMedia()
        );

        System.out.println("--- Iniciando Campanha de Marketing ---\n");

        for(SendMessage servico : servicos) {
            String status = servico.sendMessage(mensagemMarketing);
            System.out.println(status);
        }


    }
}
