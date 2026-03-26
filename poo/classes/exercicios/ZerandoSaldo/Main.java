package poo.classes.exercicios.ZerandoSaldo;
/*
Imagine que você está desenvolvendo um sistema de conta digital onde os usuários podem
realizar transações financeiras. Em determinadas situações, como encerramento de conta,
é necessário zerar o saldo disponível.

Crie um programa que:

Defina uma classe com o atributo saldo.
Implemente um metodo que redefine o valor do saldo para 0.0.
Implemente um metodo que mostra o saldo atual formatado.

*/
public class Main {
    static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.setSaldo(5000);

        conta1.exibirSaldo();
        conta1.zerarSaldo();
        conta1.exibirSaldo();
    }
}
