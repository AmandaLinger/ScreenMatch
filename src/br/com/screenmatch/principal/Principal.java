package br.com.screenmatch.principal;

import br.com.screenmatch.models.Episodio;
import br.com.screenmatch.models.Filme;
import br.com.screenmatch.models.Serie;
import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " +  meuFilme.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.calculaMedia());

        Serie serie1 = new Serie("AHS" , 2012);
        serie1.setAtiva(true);

        serie1.setTemporadas(9);
        serie1.setMinutosPorEpisodio(60);
        serie1.setEpisodiosPorTemporada(12);
        serie1.exibeFichaTecnica();

        System.out.println("Duração da série: " +  serie1.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar" , 2012);
        outroFilme.setDuracaoEmMinutos(240);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(outroFilme);
        System.out.println("o tempo total é: " + calculadora.getTempoTotal());

        calculadora.inclui(serie1);
        System.out.println("o tempo total é: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalAvaliacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Uma noite de crime",2010 );
        filmeDoPaulo.setDuracaoEmMinutos(240);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();  //usando ArrayList
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);

        System.out.println("Lista de Filmes: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes);
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(1).getNome().toString()); // pega o elemento com índice 1
    }
}