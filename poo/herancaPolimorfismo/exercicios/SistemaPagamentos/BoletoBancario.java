package poo.herancaPolimorfismo.exercicios.SistemaPagamentos;

public class BoletoBancario extends Pagamento{

    public BoletoBancario(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Boleto de R$%.2f gerado com sucesso (Taxa: R$%.2f)\n",
                getValor(), calcularTaxa());
    }

    @Override
    public double calcularTaxa() {
        return getValor() * 0.01;
    }

}
