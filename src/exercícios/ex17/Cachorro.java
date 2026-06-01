package exercícios.ex17;

public class Cachorro extends Animal {
    private String nome;
    private String raca;
    private String cor;

    public Cachorro(String nome, String raca, String cor) {
        super (nome ,
                raca ,
                cor);
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }


    public String getCor() {
        return cor;
    }


    @Override
    public String toString() {
        return "O animal: " + this.getNome() + "é da cor: " + this.getCor() +  ", e da raca: " + this.getRaca();
    }
}
