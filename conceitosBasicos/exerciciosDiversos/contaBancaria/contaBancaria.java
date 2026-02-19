package conceitosBasicos.exerciciosDiversos.contaBancaria;

public class contaBancaria {
    private double saldo;
    private double limiteChequeEspecial;
    private double chequeEspecialUsado;

    //Construtor
    public contaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        this.chequeEspecialUsado = 0;

        if (depositoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }
    }
    // Consultar saldo
    public double consultarSaldo() {
        return saldo;
    }
    //Consultar limite do cheque especial
    public double consultarChequeEspecial() {
        return limiteChequeEspecial;
    }

    // Consultar saldo total (saldo + cheque especial)
    public double saldoTotalDisponivel() {
        return saldo + limiteChequeEspecial;
    }
    //Sacar dinheiro
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            double valorNecessario = valor - saldo;

            if (valorNecessario <= limiteChequeEspecial) {
                saldo = 0;
                limiteChequeEspecial -= valorNecessario;
                chequeEspecialUsado += valorNecessario;
            } else {
                System.out.println("Saldo e cheque especial insuficientes.");
            }
        }
    }
    //Depositar dinheiro
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
    }
    //Pagar boleto
    public void pagarBoleto(double valor) {
        sacar(valor);
    }
    //Verificar se está usando um chuque especial
    public boolean estaUsandoChequeEspecial() {
        return chequeEspecialUsado > 0;
    }
}
