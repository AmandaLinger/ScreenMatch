package exercícios.ex34;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


// EXERCICIO DA ROCKETSEAT (CURSO JAVA - JAVA N-IO ,VÍDEO: LAYOUTS)
public class SistemaDeCadastros {
    public static void main(String[] args) {
        List<Cadastro> cadastros = new ArrayList<>();
        cadastros.add(new Cadastro("Amanda Marques", "F", 915846321L, LocalDate.of(2004,10,5), 100.0, true  ));
        cadastros.add(new Cadastro("Julia Maria", "F", 915853621L, LocalDate.of(2000,8,1), 50.0, true  ));
        cadastros.add(new Cadastro("Joao Silva", "M", 9158414268L, LocalDate.of(2004,12,10), 15.0, true  ));

        escreverLayoutDelimitado(cadastros);
        escreverLayoutPosicional(cadastros);
    }

    public static void escreverLayoutDelimitado(List<Cadastro> cadastros) {
        System.out.println("***** - LAYOUT DELIMITADO - *****");

        System.out.println("Em breve...");
    }

    public static void escreverLayoutPosicional(List<Cadastro> cadastros) {
        System.out.println("***** - LAYOUT POSICIONAL - *****");

        System.out.println("Em breve...");
    }

    //ex não finalizado
}
