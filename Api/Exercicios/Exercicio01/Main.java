package Api.Exercicios.Exercicio01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/*Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse
para fazer uma consulta à API do Google Books. Solicite ao usuário que insira o título
de um livro, e exiba as informações disponíveis sobre o livro retornado pela API.*/
public class Main {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do livro que deseja obter informações: ");
        var busca = scanner.nextLine();

        var endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca + "&key=AIzaSyCCBwAjCkUUG5w1z2MFtMC2dPY-2dQb8Ts";

        // Criando um objeto da classe HttpClient
        HttpClient client = HttpClient.newHttpClient();
        // Criando um objeto da classe Request
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
