package exercícios.ex24;

import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Amanda", 18);
        Pessoa p2 = new Pessoa("Matheus", 30);
        Pessoa p3 = new Pessoa("Elizeu", 40);


        List<Pessoa> pessoas = new LinkedList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        System.out.println("Lista de pessoas: " + pessoas);
    }
}
