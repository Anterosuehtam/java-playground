package trycatch.Exercicio02;

public class SenhaInvalidaException extends RuntimeException{

    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }

}
