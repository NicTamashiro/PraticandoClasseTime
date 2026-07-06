package VerificandoDataEvento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2025,3,10);
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data do evento: " + dataEvento.format(formato));
        System.out.println("Data atual: " + dataAtual.format(formato));

        if(dataAtual.isAfter(dataEvento)){
            System.out.println("O evento ja ocorreu.");
        } else {
            System.out.println("O evento ainda esta por vir.");
        }
    }
}
