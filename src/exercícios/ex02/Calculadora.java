package exercícios.ex02;

import java.util.Scanner;

public class Calculadora {

    Scanner scanner = new Scanner(System.in);
    int calcula(){
        System.out.println("Digite o número que deseja calcular:");
        int numero = scanner.nextInt();
        return numero*numero;
    }
}
