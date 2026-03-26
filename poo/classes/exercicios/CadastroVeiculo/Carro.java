package poo.classes.exercicios.CadastroVeiculo;

public class Carro {

    private String modelo;

    private String placa;

    private int ano;

    public Carro(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public void exibeInfo(){
        System.out.println("Modelo do carro: " + modelo + "\nPlaca: " + placa + "\nAno: " + ano);
    }
}
