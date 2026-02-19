package conceitosBasicos.herancaPolimorfismo;

public non-sealed class Salesman extends Employee{
    private double percentPerSold;
    private double soldAmount;

    public Salesman(String code,
                    double salary,
                    int age,
                    String adress,
                    String name,
                    double percentPerSold,
                    double soldAmount) {
        super(code, salary, age, adress, name);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode() {
        return "SL" + super.code;
    }

    @Override
    public double getFullSalary() {
        return this.salary + ((soldAmount * percentPerSold) / 100);
    }

    public Salesman() {
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }
}
