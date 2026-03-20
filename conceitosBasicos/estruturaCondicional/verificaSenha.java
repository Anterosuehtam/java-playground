package conceitosBasicos.estruturaCondicional;

import java.util.Scanner;

/*Jéssica trabalha no setor de TI de uma empresa e precisa garantir a segurança
dos acessos ao sistema interno. Os funcionários utilizam uma senha fixa para acessar
suas contas, e o sistema deve verificar se a senha inserida está correta.

Ajude Jéssica a criar um programa que, com base em uma senha pré-definida, por exemplo: 123456,
verifique se o que o usuário digitou está correto ou não. O programa deve comparar a tentativa
com a senha correta e exibir se o acesso foi permitido ou negado.*/

public class verificaSenha {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senhaPadrao = "123456";

        System.out.println("Insira uma senha: ");
        var senhaDigitada = scanner.nextLine();

        if (senhaDigitada.equals(senhaPadrao)) {
            System.out.println("Acesso permitido!");
        }else{
            System.out.println("Acesso negado!");
        }
    }
}
