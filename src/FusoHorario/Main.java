package FusoHorario;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime horaAtualTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Horário atual em Tóquio: " + horaAtualTokyo.format(formato));
    }
}
