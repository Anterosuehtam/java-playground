package conceitosBasicos.exerciciosDiversos.modeloCarro;

public class Main {
   public static void main() {
    Carro carro1 = new Carro();

    carro1.definirModelo("Corsa");
    carro1.definirPrecos(18000, 22000, 25000);

    carro1.exibirInformacoes();
    System.out.println("\nO menor preço é: " + carro1.calcularMenorPreco());
    System.out.println("O maior preço é: " + carro1.calcularMaiorPreco());
    }
}