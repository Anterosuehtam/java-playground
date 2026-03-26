package poo.classes.exercicios.AgendaContatos;

import java.util.ArrayList;
import java.util.List;
/*Você está desenvolvendo um aplicativo de agenda para uma empresa.
Os funcionários precisam acessar rapidamente os contatos de clientes
e fornecedores, mantendo as informações organizadas e fáceis de localizar.

Crie uma classe que:

Armazene contatos com nome e telefone em uma lista
Permita visualizar todos os contatos cadastrados
Formate a exibição para melhor legibilidade
*/
public class Main {
    static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("Matheus Silva", "(11) 985096930"));
        contatos.add(new Contato("Renato Antônio", "(21) 947618732"));
        contatos.add(new Contato("Tania Cristina", "(64) 927364750"));

        System.out.println("Lista de contatos:");
        int indice = 1;
        for (Contato contato : contatos) {
            System.out.printf("%d. %s - %s\n",
                    indice++,
                    contato.getNome(),
                    contato.getTelefone());
        }
    }
}
