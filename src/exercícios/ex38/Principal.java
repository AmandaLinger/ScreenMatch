package exercícios.ex38;

import br.com.screenmatch.models.Filme;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();

        Pessoa pessoa1 = new Pessoa("Amanda", 21);
        Pessoa pessoa2 = new Pessoa("Ronaldo", 19);
        Pessoa pessoa3 = new Pessoa("Joao", 13);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Quantidade de pessoas na lista: " + listaDePessoas.size());

        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));

        System.out.println(listaDePessoas);
    }
}
