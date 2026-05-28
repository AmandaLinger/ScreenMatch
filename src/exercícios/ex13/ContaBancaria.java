package exercícios.ex13;

public class ContaBancaria {
    protected String nome;
    protected double saldo;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: " + this.saldo);
    }
}
