package AjustandoDataVencimento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataVencimentoOriginal = LocalDate.of(2025,3,20);
        int numeroDeMeses = 1;
        LocalDate novaDataVencimento = dataVencimentoOriginal.plusMonths(numeroDeMeses);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Nova data de vencimento: " + novaDataVencimento.format(formato));
    }
}
