package exercícios.ex37;

import com.google.gson.Gson;

public class ExecutaVeiculo {
    public static void main(String[] args) {
        Veiculo newVeiculo = new Veiculo("Fusca", "branco", 1998);

        Gson gson = new Gson();
        String json = gson.toJson(newVeiculo);

        System.out.println(json);
    }
}
