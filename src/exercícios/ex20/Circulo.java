package exercícios.ex20;

public class Circulo implements Forma {
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double areaTotal;
        areaTotal = 3.14 * (this.raio * this.raio);
        System.out.println("A área total do círculo é de: " + areaTotal);
    }
}
