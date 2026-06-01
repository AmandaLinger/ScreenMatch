package exercícios.ex19;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Livro", 25.5);
        Produto produto2 = new Produto("Marcador", 7);
        Produto produto3 = new Produto("Mochila", 50);

        ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        double mediaDeValores = 0;

        for (Produto produtos : listaDeProdutos ) { // usando o loop for
            mediaDeValores += produtos.getPreco();
        }

        mediaDeValores = mediaDeValores/listaDeProdutos.size();

        System.out.println("A lista é: " +  listaDeProdutos);
        System.out.println("A média dos valores é: " + mediaDeValores);
    }
}
