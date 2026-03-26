package poo.classes.exercicios.ValidacaoLogin;

import java.util.Scanner;

/*Imagine que você está desenvolvendo um sistema de acesso para um laboratório de informática da escola.
Os estudantes precisam autenticar-se com suas credenciais pessoais, mas o sistema deve proteger contra
tentativas de adivinhação de senhas.

Crie uma classe que:

Armazene o login e a senha de forma encapsulada.
Um metodo validarSenha() que receba as credenciais digitadas e retorne se o login foi bem-sucedido.
Uma lógica no arquivo principal que utilize a classe Scanner para ler o login e senha digitados, controlando as tentativas com um loop.
Bloqueie o acesso após 3 falhas consecutivas.
Exiba mensagens informando o resultado da tentativa e quantas restam.

*/
public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login("login123", "senha123");

        int tentativas = 3;
        while (tentativas > 0) {
            System.out.println("Digite o login: ");
            String loginDigitado = scanner.nextLine();

            System.out.println("Digite a senha: ");
            String senhaDigitada = scanner.nextLine();

            if (login.validarSenha(loginDigitado, senhaDigitada)) {
                System.out.println("Login bem-sucedido!");
                break;
            }else {
                tentativas--;
                if (tentativas == 0) {
                    System.out.println("Acesso bloqueado. Contate o administrador.");
                } else {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativas);
                }
            }
        }
    }
}
