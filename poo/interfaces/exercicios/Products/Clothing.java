package poo.interfaces.exercicios.Products;

public class Clothing extends Product {

    public Clothing(String nomeProduto, double precoProduto) {
        super(nomeProduto, precoProduto);
    }

    @Override
    public double getTax() {
        return this.getPrecoProduto() * 0.025;
    }
}
