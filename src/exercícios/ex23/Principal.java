package exercícios.ex23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Caminho das indias");
        Titulo titulo2 = new Titulo("Av Brasil");
        Titulo titulo3 = new Titulo("Dona do pedaco");

        ArrayList<Titulo> titulos = new ArrayList<Titulo>();
        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);

        System.out.println(titulos);
        Collections.sort(titulos);
        System.out.println(titulos);

    }
}
