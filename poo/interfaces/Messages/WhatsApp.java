package poo.interfaces.Messages;

public record WhatsApp() implements SendMessage {
    @Override
    public String sendMessage(String message) {
        return "Enviando mensagem por WhatsApp: " + message;
    }
}
