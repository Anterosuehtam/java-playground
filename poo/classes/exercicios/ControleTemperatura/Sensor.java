package poo.classes.exercicios.ControleTemperatura;

public class Sensor {
    private String local;
    private double temperatura;

    public void setLocal(String local) {
        this.local = local;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void exibeInformacoes(){
        System.out.println("Sensor do local: " + local);
        System.out.println("Temperatura: " + temperatura + "ºC");
        if (temperatura > 37.5){
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }
}
