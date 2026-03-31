package collections.list.exercicios.ContaBancaria;
import java.util.ArrayList;
/*Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista
de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.*/

public class Main {
    static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        contas.add(new ContaBancaria(1, 250.00));
        contas.add(new ContaBancaria(2, 5000.00));
        contas.add(new ContaBancaria(3, 1000.00));
        contas.add(new ContaBancaria(4, 800.00));

        ContaBancaria contaMaiorSaldo = contas.get(0);
        for (ContaBancaria conta : contas) {
             if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                 contaMaiorSaldo = conta;
             }

        }
        System.out.println("Conta com o maior saldo é: " + contaMaiorSaldo);
    }
}
