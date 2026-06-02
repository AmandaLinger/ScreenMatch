package exercícios.ex28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificandoSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        String senha1 = input.nextLine();

        try {
            ValidaSenha(senha1);
            System.out.println("Senha valida!");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMensagem());

        }
    }
    private static void ValidaSenha(String senha1){
        if(senha1.length() < 8){
            throw new SenhaInvalidaException("Senha invalida, precias ter no mínimo 8 caracteres");

        }
    }
}
