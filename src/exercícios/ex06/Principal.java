package exercícios.ex06;

import br.com.screenmatch.modelos.Filme;

//iniciando programação orientada a objetos
public class Principal {
    public static void main(String[] args) {
        Filme meufilme = new Filme(); //criando um novo filme

        meufilme.setNome("A culpa é das estrelas"); // passando valores para o setter
        meufilme.setAnoDeLancamento(2020);
        meufilme.setDuracaoEmMinutos(180);

        meufilme.exibeFichaTecnica(); // a variavel meuFilme executando o metodo exibeFichaTecnica

        meufilme.avalia(8);
        meufilme.avalia(10);
        meufilme.avalia(12);

        System.out.println("O total de avaliações é de: " + meufilme.getTotalDeAvaliacao());
    }
}
