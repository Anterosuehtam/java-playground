package conceitosBasicos.exerciciosDiversos.ingressosCinema;

public class Main {
    public static void main (String[] args) {
        Ingresso ingresso1 = new Ingresso();
        ingresso1.setNomeFilme("Transformers");
        ingresso1.setValor(20);
        ingresso1.setDublado(false);
        ingresso1.imprimirInformacoes();


        IngressoMeiaEntrada ingresso2 = new IngressoMeiaEntrada();
        ingresso2.setNomeFilme("Transformers");
        ingresso2.setValor(20);
        ingresso2.setDublado(false);
        ingresso2.imprimirInformacoes();

        IngressoFamilia ingresso3 = new IngressoFamilia();
        ingresso3.setNomeFilme("Transformers");
        ingresso3.setValor(20);
        ingresso3.setDublado(false);
        ingresso3.setPessoas(5);
        ingresso3.imprimirInformacoes();
    }
}
