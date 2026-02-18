package conceitosBasicos.estruturaCondicional;

public class LacoFor {

    public static void main(String[] args) {
        System.out.println("Tabuada do 5");
        var controlador = 5;
        for(var i = 1; i <= 10 ;i ++){

            System.out.println(controlador + " x " +  i + " = " + controlador * i);
        }
    }
}
