package poo.classes.exercicios.CadastroValidacao;

/*Imagine que você é responsável pelo módulo de cadastro de um sistema de gestão de estoque.
Durante o processo de entrada de mercadorias, é crítico evitar que produtos sejam registrados
com valores inconsistentes, pois isso poderia causar problemas financeiros e operacionais.

Seu desafio é implementar uma proteção que impeça a atribuição de preços negativos aos produtos,
garantindo que o sistema mantenha dados confiáveis.

Crie um programa que:

- Defina uma classe para representar um produto com nome e preço.
- Valide se o preço é um valor não negativo antes de atualizá-lo.
- Se o valor for negativo, então deverá ser redefinido para 0.00.
- Exiba uma mensagem quando a validação falhar.
Por fim, exiba uma mensagem com os dados do produto.

*/
public class Main {
    static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Camiseta");
        produto.setPreco(59.90);

        System.out.printf("Produto: %s\nPreço: %.2f\n", produto.getNome(), produto.getPreco());
    }
}
