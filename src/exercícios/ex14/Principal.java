package exercícios.ex14;

public class Principal {
    public static void main(String[] args) {
        VerificadorPrimo verificador1 =  new VerificadorPrimo();

        verificador1.verificaSeEPrimo(27);

        GeradorPrimo gerador1 =  new GeradorPrimo();
        int proximoPrimo = gerador1.geradorPrimo(17);
        System.out.println("o proximo primo após 17 é: "+ proximoPrimo);

          NumerosPrimos numerosPrimos = new NumerosPrimos();
          numerosPrimos.listarPrimos(30);
    }
}
