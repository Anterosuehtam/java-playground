package collections.map.exercicios.ChaveExistente;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Você é uma pessoa desenvolvedora que está criando um sistema de
gerenciamento de clientes para uma empresa. A equipe de atendimento
precisa acessar os dados dos clientes cadastrados no sistema através
de um ID e conta com sua ajuda para implementar este sistema de busca.

Sua tarefa é:

Armazenar os clientes através de um Map<Integer, String>, onde a chave é o ID e o valor é o nome.
Cadastrar cinco clientes no sistema.
Verificar se um ID específico existe antes de tentar recuperar o nome do cliente.
Se a chave existir, você pode acessar o nome associado; caso contrário, exiba uma mensagem informando que o cliente não foi encontrado.

*/
public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        System.out.println("Insira o ID do cliente para buscar: ");
        int idCliente = scanner.nextInt();

        //containsKey(K)Verifica se uma chave específica existe no mapa. Nesse caso, a que digitamos no scanner.
        if (clientes.containsKey(idCliente)) {
            //get(K)Retorna o valor associado a uma chave, ou null se a chave não existir. Nesse caso, vai retornar o valor atribuido à chave que digitarmos
            //no scanner
            String nomeCliente = clientes.get(idCliente);
            System.out.println("O nome do cliente com ID " + idCliente + " é: " + nomeCliente);
        } else {
            System.out.println("Cliente com ID " + idCliente + " não encontrado.");
        }
    }
}
