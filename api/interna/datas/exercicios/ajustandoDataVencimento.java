package api.interna.datas.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*Você trabalha no setor financeiro de uma empresa de serviços e é responsável por
gerenciar o vencimento das faturas dos clientes. Em alguns casos, os clientes solicitam
um adiamento da data de pagamento, e o sistema precisa calcular a nova data de vencimento
com base na quantidade de meses adicionados.

Crie um programa que:

Receba uma data de vencimento original.
Adicione um número de meses ao vencimento.
A data ajustada deve ser exibida no formato dd-MM-yyyy.

Saída esperada:

Se a data de vencimento original for 20 de março de 2025 e o adiamento for de 1 mês, a saída deve ser:

Nova data de vencimento: 20-04-2025

*/
public class ajustandoDataVencimento {
    static void main(String[] args) {

        LocalDate dataCompra = LocalDate.of(2025, 3, 15);
        LocalDate dataVencimento = LocalDate.of(2025, 7, 15);
        LocalDate dataAdiantamento = dataVencimento.minusMonths(1);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataAdiantamentoFormatada = dataAdiantamento.format(formato);
        String dataCompraFormatada = dataCompra.format(formato);
        String dataVencimentoFormatada = dataVencimento.format(formato);

        System.out.println("Data da compra: " + dataCompraFormatada);
        System.out.println("Data de vencimento original: " + dataVencimentoFormatada);
        System.out.println("Nova data de vencimento: " + dataAdiantamentoFormatada);

    }
}
