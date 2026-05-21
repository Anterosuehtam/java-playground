package streams.optional.exercicios;

import java.util.Optional;

public class QuadroNumeroPositivo {
    static void main(String[] args) {
        System.out.println(processaNumero(Optional.of(5))); // Saída: Optional[25]
        System.out.println(processaNumero(Optional.of(-3))); // Saída: Optional.empty
        System.out.println(processaNumero(Optional.empty())); // Saída: Optional.empty

    }

    public static Optional<Integer> processaNumero(Optional<Integer> numero) {

        return numero.filter(n -> n > 0).map(n -> n * n);
    }
}
