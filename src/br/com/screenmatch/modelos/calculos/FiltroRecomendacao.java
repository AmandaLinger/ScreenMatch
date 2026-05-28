package br.com.screenmatch.modelos.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) {
        if(classificavel.getClassificacao()>= 4){
            System.out.println("O titulo está bombando!");
        } else if (classificavel.getClassificacao()>= 2){
            System.out.println("O titulo tem ótimas recomendações");
        } else {
            System.out.println("Adicione o titulo na sua lista de desejos");
        }
    }
}
