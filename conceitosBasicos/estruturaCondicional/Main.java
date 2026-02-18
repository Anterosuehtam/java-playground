package conceitosBasicos.estruturaCondicional;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.nextLine();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        //Alternativa 1
        /*if (age >=  18){
            System.out.printf("%s, você tem %s anos, você pode dirigir!\n",name, age);
        } else if (age >= 16 && isEmancipated){
            System.out.printf("%s, você tem %s anos, e como é emancipado, você pode dirigir!\n",name, age);
        }
        else{
            System.out.printf("%s, você tem %s anos e não está apto para dirigir!\n",name, age);
        }*/
        //Alternativa 2
        /*if ((age >=  18) || (age >= 16 && isEmancipated)){
            System.out.printf("%s, você pode dirigir!\n",name);
        }else{
            System.out.printf("%s, você tem %s anos e não está apto para dirigir!\n",name, age);
        }*/

        //Alternativa 3
        /*
        var canDrive = ((age >=  18) || (age >= 16 && isEmancipated));
        if (canDrive){
         System.out.printf("%s, você pode dirigir!\n",name);
        }else{
            System.out.printf("%s, você tem %s anos e não está apto para dirigir!\n",name, age);
        }
         */

        //Alternativa 4
        var canDrive = ((age >=  18) || (age >= 16 && isEmancipated));
        var message = canDrive ? name + ", você pode dirigir!" : name + ", você não pode dirigir!";

            System.out.println(message);
        }
    }



