package poo.interfaces.Products;

public class HealthCare extends Product {

    public HealthCare(String nomeProduto, double precoProduto) {
        super(nomeProduto, precoProduto);
    }

    @Override
    public double getTax() {
        return this.getPrecoProduto() * 0.015;
    }
}
