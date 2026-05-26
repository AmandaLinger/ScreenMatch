package exercícios.ex09;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Julia", 7.5, 6.3, 8.0);
        Aluno aluno2 = new Aluno("Gabriela", 5.0,7.3,8.0);

        System.out.println("Aluno 1: ");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("nota 1: " + aluno1.getNota1());
        System.out.println("nota 2: " + aluno1.getNota2());
        System.out.println("nota 3: " + aluno1.getNota3());
        System.out.println(aluno1.calcularMedia());

        System.out.println("Aluno 2: ");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("nota 1: " + aluno2.getNota1());
        System.out.println("nota 2: " + aluno2.getNota2());
        System.out.println("nota 3: " + aluno2.getNota3());
        System.out.println(aluno2.calcularMedia());
    }
}
