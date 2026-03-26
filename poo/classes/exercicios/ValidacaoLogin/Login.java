package poo.classes.exercicios.ValidacaoLogin;

public class Login {
    private String login;
    private String senha;

    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String setLogin(String login) {
        this.login = login;
        return login;
    }

    public String setSenha(String senha) {
        this.senha = senha;
        return senha;
    }

    public boolean validarSenha(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

}




