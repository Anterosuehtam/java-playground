package poo.interfaces.Products;

public class Main {
    static void main(String[] args) {
        Alimentation alimento1 = new Alimentation("Carne", 100);
        System.out.println("Nome do produto: " + alimento1.getNomeProduto());
        System.out.println("Preço: R$" + alimento1.getPrecoProduto());
        System.out.println("Imposto: R$" + alimento1.getTax());
        System.out.println("Valor final com imposto aplicado: R$" + alimento1.calcularValorFinal());
    }
}
