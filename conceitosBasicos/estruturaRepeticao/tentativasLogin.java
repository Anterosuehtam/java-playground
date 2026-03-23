package conceitosBasicos.estruturaRepeticao;

import java.util.Scanner;
/*Leonardo trabalha no setor de segurança de um sistema bancário e precisa garantir que os usuários
tenham um número limitado de tentativas para inserir a senha corretamente. Se o usuário errar a senha
3 vezes seguidas, sua conta deve ser bloqueada temporariamente.

Com base nesse cenário, crie um programa que peça uma senha ao usuário e permita até 3 tentativas de erro
antes de bloquear o acesso. Se o usuário digitar corretamente antes disso, o sistema deve conceder o acesso imediatamente.
*/
public class tentativasLogin {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String senhaCorreta = "1234";

        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.println("Insira a senha para acessar a conta: ");
            String senha = scanner.nextLine();
            
            if (senha.equals(senhaCorreta)) {
                System.out.println("Senha correta! Acesso concedido!");
                break;
            } else if (tentativas > 1) {
                System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas restantes.");
            }else{
                System.out.println("Conta bloqueada temporariamente.");
            }
        }

       

    }
}
