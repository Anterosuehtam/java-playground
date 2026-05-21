package streams.map.exercicios;

import java.util.Arrays;
import java.util.List;

public class ListaEmails {
    static void main(String[] args) {
        List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com ", "Usuario@teste.Com");
        System.out.println(converterEmails(emails));
    }

    public static List<String> converterEmails(List<String> emails) {
        return emails.stream()
                .map(email -> email.trim().toLowerCase())
                .toList();
    }
}
