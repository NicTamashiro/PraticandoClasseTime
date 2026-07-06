package CalculandoDataEntrega;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.of(2026,3,15);
        LocalDate prazoEmDias = dataInicio.plusDays(15);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data de entrega: " + prazoEmDias.format(formato));
    }
}
