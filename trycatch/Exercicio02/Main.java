package trycatch.Exercicio02;

import java.util.Scanner;

/*Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch
para capturar a exceção SenhaInvalidaException, uma classe de exceção
personalizada que deve ser lançada caso a senha não atenda a critérios
específicos (por exemplo, ter pelo menos 8 caracteres).*/
public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma senha: ");
        String senha = scanner.nextLine();
        try {
            validarSenha(senha);
            System.out.println("Senha criada com sucesso!");

        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve conter ao menos 8 caracteres.");
        }
    }
}
