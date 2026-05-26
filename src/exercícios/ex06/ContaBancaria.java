package exercícios.ex06;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    public String titular;

    //criando getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }


    //criando setters
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
