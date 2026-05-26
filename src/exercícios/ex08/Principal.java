package exercícios.ex08;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Ventilador");
        produto1.getPreco(89);

        produto1.fichaTecnica();
        produto1.aplicarDesconto(10); // aplicando 10% de desconto
    }
}
