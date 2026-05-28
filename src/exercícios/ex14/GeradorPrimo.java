package exercícios.ex14;

public class GeradorPrimo extends NumerosPrimos{
    public int geradorPrimo(int ultimoPrimoConhecido){
        int proximoNumero = ultimoPrimoConhecido + 1 ;
        while ( !verificarPrimalidade(proximoNumero) ){
            proximoNumero++;
        }
        return proximoNumero;
    }
}
