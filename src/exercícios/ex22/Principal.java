package exercícios.ex22;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Numeros n1 = new Numeros(5);
        Numeros n2 = new Numeros(10);
        Numeros n3 = new Numeros(2);
        Numeros n4 = new Numeros(50);
        Numeros n5 = new Numeros(17);


        List<Numeros> listaDeNumeros = new LinkedList<>();
        listaDeNumeros.add(n1);
        listaDeNumeros.add(n2);
        listaDeNumeros.add(n3);
        listaDeNumeros.add(n4);
        listaDeNumeros.add(n5);


        Collections.sort(listaDeNumeros);
        System.out.println(listaDeNumeros);
    }
}
