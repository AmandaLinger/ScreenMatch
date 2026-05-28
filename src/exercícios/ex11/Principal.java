package exercícios.ex11;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro modelo1 = new ModeloCarro();

        modelo1.modelo = "HB20";
        modelo1.cor = "Rosa";
        modelo1.montadora = "hyundai";

        modelo1.precoAnoUm = 50.600;
        modelo1.precoAnoDois = 49.400;
        modelo1.precoAnoTres = 53.800;
        modelo1.fichaTecnica();
    }
}
