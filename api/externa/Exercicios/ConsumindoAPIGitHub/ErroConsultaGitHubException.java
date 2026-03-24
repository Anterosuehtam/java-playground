package api.externa.Exercicios.ConsumindoAPIGitHub;

public class ErroConsultaGitHubException extends RuntimeException{

    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }
}
