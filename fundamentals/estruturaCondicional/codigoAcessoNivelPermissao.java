package fundamentals.estruturaCondicional;

import java.util.Scanner;
/*João está desenvolvendo um sistema de segurança para uma empresa. Para acessar o sistema, o usuário precisa fornecer:

Um código de acesso numérico (o código correto é 2026).

Um nível de permissão numérico (os níveis válidos são 1, 2 ou 3).

O sistema só permitirá o acesso se:

O código de acesso estiver correto.

O nível de permissão for válido (1, 2 ou 3).

Caso contrário, o acesso será negado, e o programa deve informar o motivo (código incorreto, nível de permissão inválido ou ambos).
Crie um programa que receba o código de acesso e o nível de permissão e exiba uma mensagem indicando se o acesso foi
permitido ou negado, além do motivo, se for o caso.
*/
public class codigoAcessoNivelPermissao {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int codigoCorreto = 2026;
       int nivelPermissaoMinimo = 1;
       int nivelPermissaoMaximo = 3;

       System.out.print("Digite o código de acesso: ");
       int codigoDigitado = scanner.nextInt();

       System.out.print("Digite o nível de permissão: ");
       int nivelPermissao = scanner.nextInt();

       boolean codigoValido = codigoDigitado == codigoCorreto;
       boolean permissaoValida = nivelPermissao >= nivelPermissaoMinimo && nivelPermissao <= nivelPermissaoMaximo;

       if (codigoValido && permissaoValida) {
           System.out.println("Acesso permitido. Bem-vindo ao sistema!");
       } else {
           System.out.println("Acesso negado. Motivo(s):");
           if (!codigoValido) {
               System.out.println("- Código de acesso incorreto.");
           }
           if (!permissaoValida) {
               System.out.println("- Nível de permissão inválido.");
           }
       }
   }
}
