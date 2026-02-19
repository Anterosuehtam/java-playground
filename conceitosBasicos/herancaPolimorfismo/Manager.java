package conceitosBasicos.herancaPolimorfismo;

public non-sealed class Manager extends Employee{
    private String login;
    private String password;
    private double comission;

    @Override
    public String getCode() {
        return "MN" + this.code;
    }

    public Manager(String code,
                   double salary,
                   int age,
                   String adress,
                   String name,
                   String login,
                   double comission,
                   String password) {
        super(code, salary, age, adress, name);
        this.login = login;
        this.comission = comission;
        this.password = password;
    }

    public Manager() {
    }

    public Double getComission() {
        return comission;
    }

    public void setComission(Double comission) {
        this.comission = comission;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public double getFullSalary() {
        return this.salary + this.comission;
    }
}
