package poo.classes.exercicios.ControleSenha;
/*Você está desenvolvendo um sistema de autenticação para um aplicativo bancário.
Os usuários precisam ter total segurança de que suas senhas não podem ser alteradas
sem autorização, mesmo que alguém tenha acesso temporário ao dispositivo.

Crie uma classe que:

Armazene com segurança a senha do usuário
Permita alterar a senha apenas com a confirmação da senha atual
Forneça feedback sobre o resultado da operação

*/
public class Main {
    static void main(String[] args) {
    Senha senha = new Senha("12345");

    System.out.println("Senha atual: "+ senha.getSenha());
    senha.setSenha("12345", "abc123");
    System.out.println("Nova senha: "+ senha.getSenha());

    }
}
