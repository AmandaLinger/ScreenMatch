package exercícios.ex27;

import java.util.Scanner;

public class DividindoNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = input.nextInt();

        System.out.println("Digite outro numero: ");
        int numero2 = input.nextInt();

        try{
            int resultado = numero1/numero2;
            System.out.println("Resultado da divsão: " + resultado);
        } catch(ArithmeticException e){
            System.out.println("Divisão por zero não permitida");
        }
    }
}
