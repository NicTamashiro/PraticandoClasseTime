package ControleDeExpediente;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Digite o horário de entrada (HH:mm):");
        LocalTime horaEntrada = LocalTime.parse(sc.next(), formatter);

        System.out.println("Digite a carga horária diária (em horas):");
        int horasDiaria = sc.nextInt();

        System.out.println("Digite o horário real de saída (HH:mm):");
        LocalTime horaSaida = LocalTime.parse(sc.next(), formatter);

        sc.close();

        LocalTime horaSaidaPrevista = horaEntrada.plusHours(horasDiaria);

        Duration diferenca = Duration.between(horaSaidaPrevista, horaSaida);
        long horasExtras = diferenca.toHours();
        long minutosExtras = diferenca.toMinutesPart();

        System.out.println("\nHorário de entrada: " + horaEntrada.format(formatter));
        System.out.println("Horário de saída previsto: " + horaSaidaPrevista.format(formatter));
        System.out.println("Horário real de saída: " + horaSaida.format(formatter));

        if (horasExtras == 0 && minutosExtras == 0){
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;

            if(horasExtras > 0 || minutosExtras > 0){
                sinal = "+";
            } else {
                sinal = "-";
            }

            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtras) + "min");
        }
    }
}
