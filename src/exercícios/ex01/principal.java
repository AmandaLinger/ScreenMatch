package exercícios.ex01;

public class principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Amanda";
        p1.idade = 18;


        System.out.println(p1.nome + " diz: " + p1.falar());
    }
}
