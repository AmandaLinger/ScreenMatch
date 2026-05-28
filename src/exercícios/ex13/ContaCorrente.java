package exercícios.ex13;

public class ContaCorrente extends ContaBancaria{
    private double taxaTarifa = 1.1;
    public void cobrarTrafifa(){
        saldo = saldo - taxaTarifa;
        System.out.println("Saldo atual: " + saldo);
    }
}
