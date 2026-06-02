package exercícios.ex25;
import com.google.gson.Gson;

public class ConversaoJsonParaObjeto {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidadeNascimento\":\"Uberlandia\"}";

        Gson gson = new Gson();
        Pessoa pessoa1 = gson.fromJson(jsonPessoa , Pessoa.class);

        System.out.println(pessoa1);
    }
}
