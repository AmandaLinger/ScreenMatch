package exercícios.ex30;

public enum EstadoBrasileiro { //Enums são atributos que não mudam regularmente (Permanecem iguais)
    PI ("Piaui"),
    MA ("Maranhão"),
    SP ("São paulo"),
    RJ ("Rio de Janeiro"),
    MG ("Minas Gerais");

    private String nome;

    private EstadoBrasileiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}


