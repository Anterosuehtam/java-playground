package poo.interfaces.Products;

public abstract class Product implements Taxation {

    private String nomeProduto;
    private double precoProduto;

    public Product(String nomeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double calcularValorFinal() {
        return precoProduto + getTax();
    }
}
