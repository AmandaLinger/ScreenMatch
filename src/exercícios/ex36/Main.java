package exercícios.ex36;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Titulo novoTitulo = new Titulo("Titanic", 2000);

        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // Configuração do Gson com Pretty Printing
        String json = gson.toJson(novoTitulo);

        System.out.println(json);
    }
}
