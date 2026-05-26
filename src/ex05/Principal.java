package ex05;

public class Principal {
    public static void main(String[] args) {
        Alunos amanda = new Alunos();

        amanda.nome = "Amanda maria";
        amanda.idade = 18;

        amanda.informacoesDoAluno(amanda.nome);
    }
}
