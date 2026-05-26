package exercícios.ex04;

public class Principal {
    public static void main(String[] args) {
        Carro  carro1 = new Carro();

        carro1.anoFabricacao = 2010;
        carro1.cor = "Azul";
        carro1.modelo = "Ford";


        carro1.fichaTecnica();
        carro1.calculaIdade();
    }
}
