package exercícios.ex07;

public class principal {
    public static void main(String[] args) {
        IdadePessoa amanda18 = new IdadePessoa();

        amanda18.setIdade(18);
        amanda18.setNome("Amanda");

        System.out.println("o cadastro de " + amanda18.getNome() + ", que tem "+ amanda18.getIdade()+ " anos foi realizado com sucesso!");
        amanda18.verificaIdade();
    }
}
