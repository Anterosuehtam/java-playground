package poo.record;

public record Person(String name, int age) {

    public String GetInfo() {
        return "Name: " + name + " Age: " + age;
    }
}
