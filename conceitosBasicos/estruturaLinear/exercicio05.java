package conceitosBasicos.estruturaLinear;

public class Exercicio05 {
    public static void main (String[] args) {
        double media = (10.0 + 5.0) / 2;
        System.out.println(media);

        double numeroDouble = 9.5;
        int numeroInteiro = (int) numeroDouble;
        System.out.println(numeroInteiro);

        char letra = 'O';
        String palavra = "rapaz";
        System.out.printf("%s grande %s!", letra, palavra);

        double precoProduto = 10;
        int quantidade = 5;
        double valorTotal = precoProduto * quantidade;
        System.out.println("\nO valor total dos itens é: " + valorTotal);

        double valorEmDolares = 5;
        double conversorDolarParaReal = valorEmDolares + 4.94;
        System.out.printf("\nO valor de %.2f dólares equivale a %.2f reais", valorEmDolares, conversorDolarParaReal);

        double precoOriginal = 100;
        double percentualDesconto = 10;
        double precoFinal = precoOriginal - percentualDesconto;
        System.out.println("\nPreço final com desconto de 10%: " + precoFinal);
    }
}
