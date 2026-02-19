package conceitosBasicos.exerciciosDiversos.ingressosCinema;

public class IngressoFamilia extends Ingresso{
    private int pessoas;

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public double getValorReal() {
        double total = getValor() * this.pessoas;

        if (this.pessoas > 3) {
            total = total * 0.95;
        }
        return total;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("--- TIPO: FAMILIA (" + this.pessoas + " pessoas) ---");
        super.imprimirInformacoes();
    }
}
