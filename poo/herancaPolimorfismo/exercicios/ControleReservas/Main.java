package poo.herancaPolimorfismo.exercicios.ControleReservas;
/*Imagine que você está desenvolvendo um sistema de gerenciamento para um
sistema de entretenimento que oferece diversos serviços, desde restaurantes
até áreas de lazer. O sistema precisa lidar com diferentes tipos de reservas,
atendendo desde clientes casuais até os que possuem benefícios exclusivos.

Crie um programa que:

Tenha uma classe Reserva com três versões sobrecarregadas do metodo reservar():
Uma sem parâmetros, que imprime: "Reserva realizada"
Uma com data como parâmetro, que imprime: "Reserva feita para o dia [data]"
Uma com data e quantidade de pessoas, que imprime: "Reserva feita para o dia [data] para [X] pessoas"
Tenha uma subclasse ReservaVip, que herda de Reserva e sobrescreve o metodo reservar() sem parâmetros,
imprimindo uma mensagem exclusiva: "Reserva VIP confirmada com atendimento exclusivo"

*/
public class Main {
    static void main(String[] args) {
        Reserva r = new Reserva();
        r.reservar();
        r.reservar("10/04");
        r.reservar("12/04", 4);

        Reserva vip = new ReservaVip();
        vip.reservar();
    }
}
