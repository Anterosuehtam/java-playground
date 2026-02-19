package conceitosBasicos.exerciciosDiversos.loja;

public abstract class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public abstract boolean isAdministrador();

    public boolean realizarLogin(String email, String senha) {
        if(this.email.equals(email) && this.senha.equals(senha)){
            System.out.println("Login realizado com sucesso para: " + this.nome);
            return true;
        } else {
            System.out.println("Credenciais inválidas.");
            return false;
        }
    }

    public void realizarLogoff() {
        System.out.println("Logoff realizado. Até logo, " + this.nome);
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("Dados atualizados.");
    }

    // Getters e Setters comuns
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    protected void exibirDadosComuns() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Admin: " + isAdministrador());
    }
}