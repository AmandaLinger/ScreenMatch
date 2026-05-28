package exercícios.ex14;

public class VerificadorPrimo extends NumerosPrimos{
    public void verificaSeEPrimo(int numero){
        if (verificarPrimalidade(numero)){
            System.out.println(numero + " é primo");
        } else{
            System.out.println(numero + " não é primo");
        }
    }
}
