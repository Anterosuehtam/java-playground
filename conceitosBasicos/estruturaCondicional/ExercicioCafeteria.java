package conceitosBasicos.estruturaCondicional;

import java.util.Scanner;

public class ExercicioCafeteria {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("==========CAFETERIA==========\n");
        System.out.println("Quantos itens o cliente irá pedir?\n");
        int pedido = scanner.nextInt();
        int total = 0;
        for(var i = 1; i <= pedido ;i ++) {
            scanner.nextLine();
            System.out.printf("Informe o nome do item %s: \n", i);
            String nomeItem = scanner.next();
            System.out.printf("Informe o preço do item %s: \n", nomeItem);
            Double precoItem = scanner.nextDouble();

            total += precoItem;
        }
        System.out.println("Subtotal: R$" + total);
        System.out.println("O cliente é cadastrado? (true ou false)");
        boolean cadastrado = scanner.nextBoolean();

        if (cadastrado) {
            System.out.println("O cliente é cadastrado! Aplicando desconto de 10%");
            Double valorComDesconto = total * 0.90;
            System.out.println("Subtotal: R$" + valorComDesconto);
        }else {
            System.out.println("\n------------------------------");
            System.out.println("Subtotal: R$" + total);
        }
    }
}
