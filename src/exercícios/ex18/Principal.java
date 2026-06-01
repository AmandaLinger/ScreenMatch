package exercícios.ex18;

import br.com.screenmatch.models.Filme;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("A culpa é das estrelas",2020);
        Filme filme2 = new Filme("Perdidos em marte", 2010);
        Filme filme3 = new Filme("Até o ultimo dia", 2005);

        ArrayList<Filme> filmes = new ArrayList<Filme>();
        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);

        for(Filme filme : filmes){
            System.out.println(filme);
        }
    }
}
