package api.interna.datas.Exercicios;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*Você é responsável pelos projetos em uma empresa de desenvolvimento de software.
Para garantir que os prazos sejam cumpridos, você precisa calcular a data de entrega
de cada projeto com base na data de início e no prazo estimado em dias.

Você precisa criar um programa que:

Receba uma data de início.
Adicione o prazo em dias ao início do projeto.
Exiba a data final formatada corretamente.

Saída esperada:

Se a data de início for 15 de março de 2025 e o prazo for 15 dias, a saída deve ser:
Data de entrega: 30-03-2025

*/
public class dataEntrega {
    static void main(String[] args) {

        LocalDate inicioProjeto = LocalDate.of(2025, 3, 15);
        int prazoDias = 15;
        LocalDate dataEntrega = inicioProjeto.plusDays(prazoDias);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataEntrega.format(formato);
        System.out.println("Data de entrega: " + dataFormatada);

    }
}
