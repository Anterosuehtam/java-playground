package enumerados.exercicios.CodigosErro;

public enum CodigoErro {
    NOT_FOUND(404, "Indica que o servidor não pôde encontrar o recurso solicitado. Pode ser que o recurso não existe mais ou está temporariamente desativado"),
    BAD_REQUEST(400, "Erro proveniente do lado do cliente, exemplo: Erro de sintaxe, mensagem de requisição inválida..."),
    INTERNAL_SERVER_ERROR(500, "Erro proveniente do lado do servidor, indica que o servidor encontrou uma condição inesperada que o impediu de atender a solicitação");

    private final int codigo;
    private final String descricao;

    CodigoErro(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
