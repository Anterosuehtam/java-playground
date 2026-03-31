package fundamentals.estruturaCondicional;

import java.util.Scanner;
/*Maria trabalha em um banco de sangue e precisa verificar se um doador é compatível
para doar sangue. Para ser compatível, o doador deve atender aos seguintes critérios:

Ter entre 18 e 65 anos.
Pesar mais de 50 kg.

Ela deseja um programa que receba a idade e o peso do doador e informe se ele é compatível
para doar sangue. Se não for, o programa deve indicar qual critério não foi atendido.

Como você criaria um programa que receba a idade e o peso do doador e exiba uma mensagem indicando
se ele é compatível ou não, além de informar o critério não atendido, se for o caso?*/
public class DoacaoDeSangueCompativel {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade para doar sangue: ");
        int idade = scanner.nextInt();

        System.out.println("Informe o seu peso para doar sangue: (em kg)");
        int peso = scanner.nextInt();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;

        if (idadeValida && pesoValido) {
            System.out.println("Você pode doar sangue.");
        }else {
            System.out.println("Você não pode doar sangue. Motivo: ");
            if (!idadeValida) {
                System.out.println("- Deve ter entre 18 e 65 anos.");
            }
            if (!pesoValido){
                System.out.println("- Deve pesar mais de 50kg");
            }
        }
    }
}
