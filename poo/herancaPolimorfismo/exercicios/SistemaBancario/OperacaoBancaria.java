package poo.herancaPolimorfismo.exercicios.SistemaBancario;

public abstract class OperacaoBancaria implements AcaoBancaria {
    private double valor;

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
