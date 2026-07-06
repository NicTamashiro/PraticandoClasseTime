package LembretePagamento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2025,3,30);
        int dataAntecedencia = 5;
        LocalDate disparoMensagem = dataVencimento.minusDays(dataAntecedencia);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Data do lembrete: " + disparoMensagem.format(formato));
    }
}
