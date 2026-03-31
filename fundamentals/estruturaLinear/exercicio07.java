package fundamentals.estruturaLinear;
/*Você está desenvolvendo um sistema de gerenciamento de estoque que exige
que as quantidades dos produtos sejam registradas como números inteiros. Isso
ocorre porque um estoque físico não pode conter frações de um item, por exemplo,
não faz sentido ter "19.5" unidades de um produto. No entanto, os dados disponíveis
atualmente estão no formato double, que permite valores decimais.
Para atender às exigências do sistema, crie um programa que converta a quantidade de
double para int, garantindo que os valores sejam adequados ao formato aceito.*/

public class exercicio07 {
    static void main(String[] args) {
        double valorDouble = 19.5;

        int valorInteiro = (int)valorDouble;

        System.out.println("O valor inteiro do produto é: " + valorInteiro);
    }

}
