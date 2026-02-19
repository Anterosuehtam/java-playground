package poo.interfaces.Messages;

public record Sms() implements SendMessage{

    @Override
    public String sendMessage(String message) {
        return "Enviando a mensagem por SMS: " + message;
    }
}
