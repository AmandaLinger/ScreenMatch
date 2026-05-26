package ex04;

import java.time.LocalDate;

public class Carro {
    String modelo;
    int anoFabricacao;
    String cor;


    int calculaIdade(){
        int ano = LocalDate.now().getYear();
        int idadeCarro = ano - anoFabricacao;
        System.out.println("o carro " + modelo + " foi fabricado a " + idadeCarro + " anos");
        return idadeCarro;
    }

    void fichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricacao: " + anoFabricacao);
        System.out.println("Cor: " + cor);
    }
}
