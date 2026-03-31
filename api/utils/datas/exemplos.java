package api.utils.datas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class exemplos {
    static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2026, 4, 25);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data segunda parcela: " + dataSegundaParcela);

        //is.equal
        /*if (dataPrimeiraParcela.isEqual(LocalDate.now())) {
            System.out.println("Hoje é o dia do vencimento");
        } else {
            System.out.println("Ainda não está no dia do vencimento");
        }*/

        //is.before
        if (dataPrimeiraParcela.isBefore(LocalDate.now())) {
            System.out.println("Anterior ao dia do vencimento");
        } else {
            System.out.println("Superior ao dia do vencimento");
        }

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data compra formatada: " + dataCompra.format(formato));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data conclusão compra: " + dataConclusaoCompra);

        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(
                ZoneId.of("America/New_York"));

        System.out.println("Data conclusão compra NY: " + dataCompraNy);

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);

        Duration duracao = Duration.between(inicio, fim);

        System.out.println("Duração do expediente: " + duracao.toHours() +
                " horas e " + duracao.toMinutesPart() + " minutos.");

        LocalDate dataPagamento = LocalDate.parse("2026-04-24");
        long diferencaEmDias = ChronoUnit.DAYS.between(dataCompra, dataPagamento);
        System.out.println("Diferença em dias: " + diferencaEmDias);


    }
}
