package Api.Exercicios.ConsumindoAPICoinGecko;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/*Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse para
fazer uma consulta à API CoinGecko e exiba a cotação atual de uma criptomoeda escolhida pelo usuário.*/
public class Main {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma criptomoeda para exibir a cotação atual: ");
        String criptoNome = scanner.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptoNome.replace(" ", "+") + "&vs_currencies=usd";

        // Criando um objeto da classe HttpClient
        HttpClient client = HttpClient.newHttpClient();
        // Criando um objeto da classe Request
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        // Criando um objeto da classe Response que utiliza o metodo send da classe Client
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
