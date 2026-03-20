package conceitosBasicos.estruturaRepeticao;

import java.util.Scanner;
/*Carla começou a praticar trilha e deseja saber quantos degraus precisará
subir para chegar ao topo de uma escadaria. Ela sobe um degrau por vez e quer
um programa que mostre sua subida até o topo. Sua tarefa é criar um programa
que receba um número e simule a subida da escadaria.
*/
public class quantidadeDegraus {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus: ");
        int degraus = scanner.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Você chegou ao topo!");

    }
}
