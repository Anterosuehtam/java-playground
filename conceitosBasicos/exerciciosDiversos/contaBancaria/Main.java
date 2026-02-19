package conceitosBasicos.exerciciosDiversos.contaBancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do depósito inicial: ");
        double depositoInicial = scanner.nextDouble();

        contaBancaria conta = new contaBancaria(depositoInicial);

        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                // SACAR
                System.out.print("Digite o valor do saque: ");
                double saque = scanner.nextDouble();

                while (conta.saldoTotalDisponivel() < saque) {
                    System.out.println("Saldo insuficiente.");
                    System.out.print("Digite um valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                }

                conta.sacar(saque);
                System.out.println("Saque realizado com sucesso.");

            } else if (opcao == 2) {
                // DEPOSITAR
                System.out.print("Digite o valor do depósito: ");
                double deposito = scanner.nextDouble();
                conta.depositar(deposito);

            } else if (opcao == 3) {
                System.out.println("Encerrando o sistema...");

            } else {
                System.out.println("Opção inválida.");
            }

            // Mostrar saldos após cada operação
            System.out.println("\nSaldo atual: R$ " + conta.consultarSaldo());
            System.out.println("Saldo total disponível (com cheque especial): R$ "
                    + conta.saldoTotalDisponivel());
            System.out.println("Usando cheque especial? " + conta.estaUsandoChequeEspecial());
        }

        scanner.close();
    }
}