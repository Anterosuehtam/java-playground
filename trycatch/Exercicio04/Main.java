package trycatch.Exercicio04;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie
um programa que instancia um objeto Titulo, serializa esse objeto para JSON usando
a biblioteca Gson e imprime o resultado. Modifique o programa para que o JSON gerado
seja formatado de maneira mais elegante. Utilize o metodo setPrettyPrinting para
alcançar esse resultado.*/
public class Main {
    static void main(String[] args) {

        Titulo titulo1 = new Titulo("Harry Potter", "J.K. Rowling", 2000);
        System.out.println("========OBJETO EM JAVA========");
        System.out.println(titulo1);
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(titulo1);
            System.out.println("\n========OBJETO EM JSON========");
            System.out.println(json);
        } catch (ErroDeConversaoDeDadosException e) {
            throw new ErroDeConversaoDeDadosException("Não foi possível converter os dados dos atributos para JSON");
        }

    }
}
