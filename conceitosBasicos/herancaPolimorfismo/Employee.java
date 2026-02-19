package conceitosBasicos.herancaPolimorfismo;

public sealed abstract class Employee permits Manager, Salesman {

    protected String code;
    protected String name;
    protected String adress;
    protected int age;
    protected Double salary;

    public Employee(String code,
                    double salary,
                    int age,
                    String adress,
                    String name) {
        this.code = code;
        this.salary = salary;
        this.age = age;
        this.adress = adress;
        this.name = name;
    }

    public Employee() {
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double getFullSalary();

    public double getFullSalary(double extra) {
        return this.getFullSalary() + extra;
    }
}
