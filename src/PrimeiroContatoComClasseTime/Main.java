package PrimeiroContatoComClasseTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2026, 8,7);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if(dataPrimeiraParcela.isBefore(LocalDate.now())){
            System.out.println("Anterior dia do vencimento");
        } else {
            System.out.println("Superior dia do vencimento");
        }

        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data segunda parcela: " + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data compra formatada: " + dataCompra.format(formato));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data conclusao compra formatada: " + dataConclusaoCompra);
        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data conclusao compra formatada NY: " + dataCompraNy);

        LocalTime inicio = LocalTime.of(9,0);
        LocalTime fim = LocalTime.of(17,30);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duracao: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos.");

        LocalDate dataPagamento = LocalDate.parse("2026-10-30");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferenca em dias: " + periodo.getDays() + " | meses: " + periodo.getMonths());
    }
}