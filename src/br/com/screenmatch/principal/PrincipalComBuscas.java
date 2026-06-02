package br.com.screenmatch.principal;

import br.com.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.screenmatch.models.Titulo;
import br.com.screenmatch.models.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBuscas {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca:");
        String nomeFilm = leitura.nextLine().replace(" ", "+");

        String endereco = "https://omdbapi.com/?t=" + nomeFilm + "&apikey=4ea549c4";
        try{

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

            TituloOmdb tituloOmdb = gson.fromJson(response.body(), TituloOmdb.class);
            System.out.println(tituloOmdb);

            Titulo meuTitulo = new Titulo(tituloOmdb);
            System.out.println("Titulo já convertido");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Algum erro de argumento na busca, verifique e etente novamente");
        } catch (ErroDeConversaoDeAnoException e){
            System.out.println(e.getMessage());
        }

        System.out.println("O programa finalizou corretamente");
    }
}
