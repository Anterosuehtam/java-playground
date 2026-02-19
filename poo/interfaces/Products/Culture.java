package poo.interfaces.Products;

public class Culture extends Product{

    public Culture(String nomeProduto, double precoProduto) {
        super(nomeProduto, precoProduto);
    }

    @Override
    public double getTax() {
        return getPrecoProduto() * 0.04;
    }
}
