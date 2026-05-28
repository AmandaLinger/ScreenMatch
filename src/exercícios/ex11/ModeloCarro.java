package exercícios.ex11;

public class ModeloCarro extends Carro {
    protected String cor;
    protected String montadora;

    public void fichaTecnica(){
        System.out.println("modelo: " + modelo);
        System.out.println("cor: " + cor);
        System.out.println("montadora: " + montadora);

        calculaPreco(precoAnoUm,precoAnoDois,precoAnoTres);
    }
}
