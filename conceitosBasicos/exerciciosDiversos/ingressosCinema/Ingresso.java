package conceitosBasicos.exerciciosDiversos.ingressosCinema;

public class Ingresso {
    private double valor;
    private String nomeFilme;
    private boolean dublado;

    public double getValorReal() {
        return this.valor;
    }

    public boolean isDublado() {
        return dublado;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimirInformacoes() {
        System.out.println("--- Detalhes do Ingresso ---");
        System.out.println("Filme: " + this.nomeFilme);
        System.out.println("Valor Base: R$" + this.valor);
        System.out.println("Valor a Pagar: R$" + this.getValorReal());

        if (this.dublado) {
            System.out.println("Audio: Dublado");
        } else {
            System.out.println("Audio: Legendado");
        }
        System.out.println("----------------------------\n");
    }

}
