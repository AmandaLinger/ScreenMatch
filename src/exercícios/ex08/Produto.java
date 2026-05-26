package exercícios.ex08;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco(double preco) {
        return this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double porcentagemDesconto){
        double calculaPorcentagem = (preco * porcentagemDesconto)/100;
        double valorFinal = preco -  calculaPorcentagem;
        System.out.println("o valor final da sua compra é: R$ " + valorFinal);
    }
    public void fichaTecnica(){
        System.out.println("produto: " + nome);
        System.out.println("preco: " + preco);
    }
}
