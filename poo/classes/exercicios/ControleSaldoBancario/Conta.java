package poo.classes.exercicios.ControleSaldoBancario;

public class Conta {

    private String titular;

    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        if (deposito > 0 ) {
            saldo += deposito;
        }else {
            System.out.println("O valor de depósito deve ser maior que 0");
        }
    }

    public void sacar(double saque){
        if (saque <= saldo){
            saldo -= saque;
        }else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual de %s: %.2f\n", titular, saldo);
    }
}
