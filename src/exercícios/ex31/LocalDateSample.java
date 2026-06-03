package exercícios.ex31;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now(); //representa apenas a data do dia atual
        System.out.println(dataAtual);


        LocalDate meuAniversario = LocalDate.of(2026,10,5); // setando uma data fixa
        System.out.println("o meu aniversário será em : " + meuAniversario);


        //recebendo uma data no formato string e convertendo ela:
        String dataEmString = "2026-10-05";
        LocalDate dataConvertida = LocalDate.parse(dataEmString);
        System.out.println("A data convertida é : " + dataConvertida);

    }
}