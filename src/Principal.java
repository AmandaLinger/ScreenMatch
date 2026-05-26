//iniciando programação orientada a objetos
public class Principal {
    public static void main(String[] args) {
        Filme meufilme = new Filme(); //criando um novo filme

        meufilme.nome = "O poderoso chefão";
        meufilme.anoDeLancamento = 2020;
        meufilme.duracaoEmMinutos = 60;

        meufilme.exibeFichaTecnica(); // a variavel meuFilme executando o metodo exibeFichaTecnica

        meufilme.avalia(8);
        meufilme.avalia(10);
        meufilme.avalia(12);
        System.out.println("a soma das avaliações é : " + meufilme.somaDasAvaliacoes);
        System.out.println("você fez " + meufilme.totalDeAvaliacao + " avaliações");
        System.out.printf(" A média das avaliações é : " + meufilme.calculaMedia());
    }
}
