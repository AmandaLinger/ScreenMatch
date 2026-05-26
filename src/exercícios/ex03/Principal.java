package exercícios.ex03;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();

        musica1.titulo = "musica 1";
        musica1.artista = "Paulo";
        musica1.anoLancamento = 2015;

        musica1.avaliar(8);
        musica1.calculaMedia(8,1);
        musica1.fichaTecnica();
    }
}
