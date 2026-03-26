package poo.classes.exercicios.CadastroVeiculo;
/*Você está desenvolvendo um sistema para uma oficina mecânica registrar os veículos
que chegam para manutenção. Cada carro precisa ser identificado com algumas informações
para o controle interno.

Crie um programa que:

Defina uma classe com os atributos modelo, placa e ano.
Defina uma instancia dessa classe através do metodo construtor.
Exiba as informações do veículo no console.

*/
public class Main {
    static void main(String[] args) {
        Carro carro = new Carro("Sedan", "EKJ-0192", 2024);

        carro.exibeInfo();
    }
}
