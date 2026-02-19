package poo.interfaces.CurrencyConverter;

public class Converter implements FinanceConverter{
    @Override
    public double converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.19;
        return valorDolar * cotacaoDolar;
    }
}
