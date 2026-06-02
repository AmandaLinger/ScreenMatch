package exercícios.ex23;

import static java.util.Objects.compare;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) { // ordenando um array de strings
        return this.nome.compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo{" + "nome=" + nome + '}';
    }
}
