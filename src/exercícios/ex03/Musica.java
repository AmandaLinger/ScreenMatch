package exercícios.ex03;

import java.util.Scanner;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double nota;
    int numeroDeAvaliacoes;

    Scanner scanner = new Scanner(System.in);

    double avaliar(double nota){
        numeroDeAvaliacoes++;
        System.out.println("sua nota é: " + nota);
        return nota;
    }
    double calculaMedia(double nota, int numeroDeAvaliacoes){
        double media = nota / numeroDeAvaliacoes;
        System.out.println("A média de avaliações é: " + media);
        return media;
    }

    void fichaTecnica(){
        System.out.println("Nome da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoLancamento);

    }
}
