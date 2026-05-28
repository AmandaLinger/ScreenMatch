package exercícios.ex11;

import java.util.Arrays;

public class Carro {
    protected String modelo;
    protected double precoAnoUm;
    protected double precoAnoDois;
    protected double precoAnoTres;


    public void calculaPreco(double precoAnoUm, double precoAnoDois, double precoAnoTres) {
        double[] ordenaPreco = {precoAnoUm, precoAnoDois, precoAnoTres};
        Arrays.sort(ordenaPreco);
        System.out.println("O menor valor médio foi de: R$" + ordenaPreco[0] + " e o maior valor medio foi de: R$" + ordenaPreco[2]);
    }
}
