package exercícios.ex15;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa();
        p1.setNome("Amanda");
        p1.setIdade(18);

        Pessoa p2 = new Pessoa();
        p2.setNome("Juan");
        p2.setIdade(12);

        Pessoa p3 = new Pessoa();
        p3.setNome("Maria");
        p3.setIdade(15);

        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        System.out.println("Lista de Pessoas: " + listaDePessoas);
    }
}
