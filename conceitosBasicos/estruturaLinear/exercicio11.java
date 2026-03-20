package conceitosBasicos.estruturaLinear;

import java.util.Scanner;

/*Você trabalha em um e-commerce e precisa classificar os produtos em diferentes categorias com base no preço.

Escreva um programa que classifique um produto em uma categoria com base em um preço e exiba a categoria correspondente, conforme as seguintes regras:

Econômico: preço até R$ 50,00.
Intermediário: preço entre R$ 50,01 e R$ 200,00.
Premium: preço acima de R$ 200,00. Exemplo de entrada:
double preco = 150.00;

*/
public class exercicio11 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preco do produto; ");
        double preco = scanner.nextDouble();
        String categoriaProduto = "";

        if (preco > 0 && preco <= 50.0) {
            categoriaProduto = "Econômico";
        }else if (preco >= 50.01 && preco <= 200.00){
            categoriaProduto = "Intermediário";
        }else{
            categoriaProduto = "Premium";
        }
        System.out.println("Categoria do produto: " + categoriaProduto);
    }
}
