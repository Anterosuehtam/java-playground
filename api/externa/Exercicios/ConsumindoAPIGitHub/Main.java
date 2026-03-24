package api.externa.Exercicios.ConsumindoAPIGitHub;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/*Desenvolva um programa em Java que permite aos usuários consultar informações
sobre um usuário do GitHub (utilize a API pública do GitHub para obter os dados).
Crie uma classe de exceção personalizada, ErroConsultaGitHubException, que estende
RuntimeException. Lance essa exceção quando o nome de usuário não for encontrado.
No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.
*/
public class Main {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um usuário que deseja buscar no GitHub: ");
        var user = scanner.nextLine();

        var endereco = "https://api.github.com/users/" + user;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }

            String json = response.body();
            System.out.println(json);

        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}
