package poo.interfaces.Products;

public class Alimentation extends Product {

    public Alimentation(String nomeProduto, double precoProduto) {
        super(nomeProduto, precoProduto);
    }

    @Override
    public double getTax() {
        return this.getPrecoProduto() * 0.01;
    }



}
