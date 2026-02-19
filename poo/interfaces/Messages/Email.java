package poo.interfaces.Messages;

public record Email() implements SendMessage {

    @Override
    public String sendMessage(String message) {
        return "Enviando mensagem por E-mail: " + message;
    }
}
