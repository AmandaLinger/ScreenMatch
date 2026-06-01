package exercícios.ex21;


import java.util.ArrayList;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1, 150.20);
        ContaBancaria conta2 = new ContaBancaria(2, 70);
        ContaBancaria conta3 = new ContaBancaria(3, 120);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        for (ContaBancaria conta : contas) {
            System.out.println(conta);
        }

        contas.sort(Comparator.comparingDouble(ContaBancaria::getSaldoConta)); //Ordena comparando os saldos
        double maiorSaldo = contas.get(contas.size()-1).getSaldoConta(); //guarda o maior saldo em uma variavel
        System.out.println("Maior saldo: " + maiorSaldo);
    }
}
