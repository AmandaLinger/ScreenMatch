package exercícios.ex29;

public class ErroConsultaGitHubException extends Throwable {
    private String mensagem;
    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }
}
