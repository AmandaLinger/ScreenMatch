package exercícios.ex17;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Iniciando verificação de animais!");

        Cachorro meuCachorro = new Cachorro("Bento","SRD","Caramelo");
        Cachorro meuCachorro2 = new Cachorro("Ana Maria","pincher","preto");
        Cachorro meuCachorro3 = new Cachorro("Serena","pitbull","branco");

        Animal animal1 = (Animal) meuCachorro;

        meuCachorro.setDataNascimento("05-01-2009");

        ArrayList<Cachorro> arrayDeCachorros = new ArrayList<Cachorro>();
        arrayDeCachorros.add(meuCachorro);
        arrayDeCachorros.add(meuCachorro2);
        arrayDeCachorros.add(meuCachorro3);


        if(animal1 instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal1;
            System.out.println("O objeto é um cachorro");
        }else {
            System.out.println("O objeto não é um cachorro");
        }
    }
}
