package conceitosBasicos.estruturaCondicional;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 até 7: ");
        var option = scanner.nextInt();
        var message = switch (option) {
            //Jeito 1
            /*case 1:
              case 7:
                System.out.println("Fim de semana!!!");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Opção inválida");*/
            //Jeito 2
            /* case 1, 7 -> System.out.println("Final de semana!!!!");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            default -> System.out.println("Opção inválida");*/
            //Jeito 3
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format ("Hoje é %s, fim de semana!!!", day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opção inválida";
        };
        System.out.println(message);
    }
}
