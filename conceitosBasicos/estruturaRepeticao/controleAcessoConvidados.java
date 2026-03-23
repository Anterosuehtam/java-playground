package conceitosBasicos.estruturaRepeticao;

import java.util.ArrayList;
import java.util.Scanner;
/*
Maria está preparando um evento de aniversário e quer organizar a lista de convidados. Ela precisa de um sistema que:

- Exiba a lista de convidados já cadastrados caso o usuário digite "ver".
- Adicione novos nomes à lista, caso o nome não esteja lá.
- Caso o nome já esteja na lista, o programa deve informar que o nome já foi registrado.
- O programa deve permitir que Maria continue a adicionar nomes até ela digitar "sair".

*/
public class controleAcessoConvidados {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> convidados = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            String nome = scanner.nextLine().trim();

            if (nome.equalsIgnoreCase("sair")) {
                System.out.println("Programa finalizado.");
                System.out.println("Lista final dos convidados: " + convidados);
                break;
            }

            if (nome.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada de convidados: " + convidados);
                continue;
            }

            boolean jaExiste = false;
            for (String convidado : convidados) {
                if (convidado.toLowerCase().equals(nome.toLowerCase())) {
                    jaExiste = true;
                    break;
                }
            }

            if (jaExiste) {
                System.out.println("O nome " + nome + " já está na lista de convidados.");
            } else {
                convidados.add(nome);
                System.out.println(nome + " foi adicionado à lista de convidados.");
            }

        }
    }
}
