public class Filme {
    String nome;
    int anoDeLancamento;
    boolean inclusoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacao;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){ // usandoi void pois o metodo não tem retorno
        System.out.println("Nome do filme: " + nome); //instanciando objetos
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao ++;
    }

    double calculaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }

}
