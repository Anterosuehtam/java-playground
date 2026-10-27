package poo.classes.exercicios.ContaBancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        contaBancaria contaBancaria = new contaBancaria(1000);

        System.out.println(contaBancaria.consultarSaldo());

        System.out.println(contaBancaria.consultarChequeEspecial());

        System.out.println(contaBancaria.saldoTotalDisponivel());
        contaBancaria.sacar(500);

        System.out.println(contaBancaria.consultarSaldo());
    }
}