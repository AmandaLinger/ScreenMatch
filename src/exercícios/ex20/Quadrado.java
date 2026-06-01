package exercícios.ex20;

public class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    @Override
    public void calcularArea() {
        double areaQuadrado = lado * lado;
        System.out.println("A área total do quadrado é: " + areaQuadrado);
    }
}
