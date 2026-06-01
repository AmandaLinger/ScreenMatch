package exercícios.ex22;

import java.util.Arrays;
import java.util.Collections;

public class Numeros implements Comparable<Numeros>{ //implementando o comparable
    Integer numeros;

    public Integer getNumeros() {
        return numeros;
    }

    public Numeros(Integer numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "número: " + this.numeros;
    }


    @Override
    public int compareTo(Numeros outro) { // fazendo a comparação
        return Integer.compare(this.numeros, outro.getNumeros());
    }
}
