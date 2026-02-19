package conceitosBasicos.exerciciosDiversos.ingressosCinema;

public class IngressoMeiaEntrada extends Ingresso{

    @Override
    public double getValorReal() {
        return getValor() / 2;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("--- TIPO: MEIA ENTRADA ---");
        super.imprimirInformacoes();
    }
}
