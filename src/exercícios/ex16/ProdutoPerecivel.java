package exercícios.ex16;

public class ProdutoPerecivel extends Produto {
    private String dataDeValiade;

    public String isProdutoPerecivel() {
        return dataDeValiade;
    }

    public void setProdutoPerecivel(String dataDeValiade) {
        this.dataDeValiade = dataDeValiade;
    }

    public ProdutoPerecivel(String nome, double preco, int quantidade, String produtoPerecivel) {
        super(nome, preco, quantidade);
        this.dataDeValiade = dataDeValiade;
    }
}
