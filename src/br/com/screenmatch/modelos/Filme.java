package br.com.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean inclusoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao; // usando modificadores de acesso
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public void setNome(String nome) { //criando setters
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){ // usandoi void pois o metodo não tem retorno
        System.out.println("Nome do filme: " + nome); //instanciando objetos
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao ++;
    }

    double calculaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }

}
