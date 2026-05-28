package exercícios.ex13;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente conta12 = new ContaCorrente();
        conta12.nome = "Amanda";
        conta12.saldo = 5000;
        conta12.depositar(100);
        System.out.println("olá " + conta12.nome);
        conta12.consultarSaldo();

        conta12.cobrarTrafifa();
    }
}
