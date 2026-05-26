package exercícios.ex07;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade(){
        if(idade >= 18){
            System.out.println("Idade maior ou igual a 18");
        } else {
            System.out.println("Idade menor que 18");
        }
    }
}
