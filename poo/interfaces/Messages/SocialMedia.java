package poo.interfaces.Messages;

public record SocialMedia() implements SendMessage{
    @Override
    public String sendMessage(String message) {
        return "Enviando mensagem por rede social: "  + message;
    }
}
