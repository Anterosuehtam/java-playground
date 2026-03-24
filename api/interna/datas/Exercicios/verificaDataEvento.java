package api.interna.datas.Exercicios;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*Você trabalha em uma agência de turismo e é responsável pelo agendamento de eventos
como passeios e excursões. Para garantir uma boa organização, o sistema precisa verificar
se um evento já ocorreu ou ainda está por vir com base na data atual.

Crie um programa que:

Receba uma data de evento previamente cadastrada.
Compare essa data com a data atual.
Exiba a data do evento e a data atual no formato dd-MM-yyyy.
Informe se o evento já ocorreu ou ainda está por vir.
Saída esperada:

Se a data do evento for 10 de março de 2025 e a data atual for 15 de março de 2025, a saída deve ser:

Data do evento: 10-03-2025
Data atual: 15-03-2025
O evento já ocorreu.

*/
public class verificaDataEvento {
    static void main(String[] args) {
        LocalDate dataCadastrada = LocalDate.of(2026, 2, 22);
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataEventoFormatada = dataCadastrada.format(formatter);
        String dataAtualFormatada = dataAtual.format(formatter);

        System.out.println("Data do evento: " + dataEventoFormatada);
        System.out.println("Data atual: " + dataAtualFormatada);

        if (dataCadastrada.isBefore(dataAtual)){
            System.out.println("O evento já ocorreu.");
        }else{
            System.out.println("O evento ainda está por vir!");
        }
    }
}
