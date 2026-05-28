package exercícios.ex12;

public class Principal {
    public static void main(String[] args) {
        Cachorro animal1 = new Cachorro();

        animal1.nome = "Bento";
        System.out.println("O nome do animal é: " +  animal1.nome);
        animal1.abanarORabo();
        animal1.emitirSom();

        Gato animal2 = new Gato();
        animal2.nome = "Meia noite";
        System.out.println("O nome do animal é: "+ animal2.nome);
        animal2.emitirSom();
        animal2.brincaComLazer();
    }
}
