package api.utils.strings.regex;

public class obterPrimeiroEUltimoNome {
    static void main(String[] args) {
        System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
        System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"
    }

    public static String obterPrimeiroEUltimoNome(String nomeCompleto) {
        String[] nomes = nomeCompleto.trim().split("\\s+");
        if (nomes.length == 1) {
            return nomes[0]; // Apenas um nome
        }
        return nomes[0] + " " + nomes[nomes.length - 1]; // Primeiro e último
    }
}
