package poo.classes.exercicios.ZerandoSaldo;

public class Conta {
    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void zerarSaldo(){
        saldo = 0;
    }
}
