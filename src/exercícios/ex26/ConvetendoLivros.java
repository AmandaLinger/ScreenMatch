package exercícios.ex26;

import com.google.gson.Gson;

public class ConvetendoLivros {
    public static void main(String[] args) {
        String informacoesDoLivro = "{\"titulo\":\"Lunar\",\"nomeAutor\":\"Amanda\",\"editora\":\"livroHits\"}";
        Gson gson = new Gson();

        Livro livro1 = gson.fromJson(informacoesDoLivro , Livro.class); // convertendo para Gson

        System.out.println(livro1);
    }
}
