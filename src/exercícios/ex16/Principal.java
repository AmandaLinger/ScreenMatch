package exercícios.ex16;

import br.com.screenmatch.modelos.Filme;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Escova",10,10);

        Produto produto2 = new Produto("Caneta",3,2);

        Produto produto3 = new Produto("Fantasia",200,4);

        ArrayList<Produto> listaMeuProduto = new ArrayList<Produto>();
        listaMeuProduto.add(produto1);
        listaMeuProduto.add(produto2);
        listaMeuProduto.add(produto3);

        System.out.println("Sua lista de produtos tem " + listaMeuProduto.size() + " produtos");
        System.out.println("Seu produto em primeiro lugar na lista é : " + listaMeuProduto.get(0).getNome());

        System.out.println("Lista completa de itens: " + listaMeuProduto);
        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("arroz",24,3, "20-05-2026");

        System.out.println("PRODUTOS PERECIVEIS: " + produtoPerecivel1);
    }
}
