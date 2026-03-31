package collections.list.exercicios.ContaBancaria;

public class ContaBancaria {
    private int numeroConta;

    private double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString(){
        return String.format("Conta: %s, Saldo da conta: %s", numeroConta, saldo);
    }
}
