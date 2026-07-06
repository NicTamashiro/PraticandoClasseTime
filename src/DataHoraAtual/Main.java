package DataHoraAtual;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        String tarefa = "Enviar relatorio semanal";
        LocalDate dataCriacao = LocalDate.now();
        LocalTime horaCriacao = LocalTime.now();

        System.out.println("Tarefa: '" + tarefa + "' ");
        System.out.println("Data da criacao: " + dataCriacao);
        System.out.println("Hora da criacao: " + horaCriacao);

    }
}
