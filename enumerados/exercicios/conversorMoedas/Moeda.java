package enumerados.exercicios.conversorMoedas;

public enum Moeda {
    DOLAR(5.10),
    EURO(6.00),
    REAL(1.0);

    private final double taxa;

    Moeda(double taxa) {
        this.taxa = taxa;
    }

    public double converterPara(double valorEmReais) {
        return valorEmReais / taxa;
    }
}
