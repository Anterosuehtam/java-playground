package enumerados.exercicios.CodigosErro;

public class Main {
    static void main(String[] args) {
        System.out.println(CodigoErro.BAD_REQUEST.getCodigo());
        System.out.println(CodigoErro.BAD_REQUEST.getDescricao());
        System.out.println("-----------------------------------");
        System.out.println(CodigoErro.NOT_FOUND.getCodigo());
        System.out.println(CodigoErro.NOT_FOUND.getDescricao());
    }
}
