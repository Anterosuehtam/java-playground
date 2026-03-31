package fundamentals.estruturaLinear;
/*Você está desenvolvendo um sistema de monitoramento de temperatura para uma estufa de plantas.
Você recebe os dados de temperatura em graus Celsius, mas precisa exibi-los em Fahrenheit para
um relatório que será enviado para um cliente nos Estados Unidos.
Crie um programa que receba uma temperatura em graus Celsius (int) e exiba a temperatura
convertida em graus Fahrenheit (double). A fórmula para conversão é:
Fahrenheit = (Celsius * 9 / 5) + 32

*/
public class exercicio08 {
    static void main(String[] args) {
        int celsius = 20;

        double fahrenheit = (double)(celsius * 9 / 5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }
}
