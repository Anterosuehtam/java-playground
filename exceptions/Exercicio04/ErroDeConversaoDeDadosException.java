package exceptions.Exercicio04;

public class ErroDeConversaoDeDadosException extends RuntimeException{
    private String mensagem;

    public ErroDeConversaoDeDadosException(String mensagem) {
        this.mensagem = mensagem;
    }
}
