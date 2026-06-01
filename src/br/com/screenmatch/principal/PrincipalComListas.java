package br.com.screenmatch.principal;

import br.com.screenmatch.models.Filme;
import br.com.screenmatch.models.Serie;
import br.com.screenmatch.models.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme outroFilme = new Filme("Avatar" , 2012);
        Filme filmeDoPaulo = new Filme("Uma noite de crime",2010 );
        Filme meuFilme = new Filme("O poderoso chefão", 1970);

        meuFilme.avalia(10);
        outroFilme.avalia(5);
        filmeDoPaulo.avalia(7);

        Serie serie1 = new Serie("AHS" , 2012);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();  //usando ArrayList
        listaDeAssistidos.add(filmeDoPaulo);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(serie1);

        for(Titulo titulo : listaDeAssistidos) { // usando o loop for-each (enquanto tiver "titulo"  na listaDeAssistidos)
            System.out.println(titulo); // ele vai printar na tela o título com a formatação do toString

            if(titulo instanceof Filme filme &&  filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

       List<String> buscaPorArtistas = new LinkedList<>();
        buscaPorArtistas.add("Jose Gomes");
        buscaPorArtistas.add("Joana");
        buscaPorArtistas.add("Renata Fernandes");
        buscaPorArtistas.add("Aurora Cunha");

        System.out.println("Lista de artista desordenada: " + buscaPorArtistas);
        Collections.sort(buscaPorArtistas);
        System.out.println("Lista de artistas: " + buscaPorArtistas);
        System.out.println(listaDeAssistidos);

        listaDeAssistidos.sort(Comparator .comparing(Titulo::getAnoDeLancamento)); //ordenando a lista pelo ano de lancamento
        System.out.println("Ordenando por ano");
        System.out.println(listaDeAssistidos);;
    }
}
