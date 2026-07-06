package ConvertendoParaOutroFuso;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime horaAtual = ZonedDateTime.now();
        ZonedDateTime horaAtualSydney = horaAtual.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário atual no sistema: " + horaAtual.format(formato));
        System.out.println("Horário atual em Sydney: " + horaAtualSydney.format(formato));
    }
}
