package exercícios.ex21;

public class ContaBancaria {
    private int numeroConta;
    private double saldoConta;

    public double getSaldoConta() {
        return saldoConta;
    }

    public ContaBancaria(int numeroConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    @Override
    public String toString() {
        return "numero da conta: " + numeroConta + ", saldo da conta: " + saldoConta;
    }
}
