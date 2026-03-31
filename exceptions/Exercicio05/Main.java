package exceptions.Exercicio05;

import com.google.gson.Gson;
import exceptions.Exercicio04.ErroDeConversaoDeDadosException;

/*Defina uma classe chamada Veiculo com os atributos necessários.
Em seguida, crie um programa que instancia um objeto Veiculo, serializa
esse objeto para JSON usando a biblioteca Gson e imprime o resultado.*/
public class Main {
    static void main(String[] args) {
    Veiculo veiculo1 = new Veiculo("Prata", 2026, "Sedan");
    try {
        Gson gson = new Gson().newBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(veiculo1);
        System.out.println(json);
    }catch (ErroDeConversaoDeDadosException e){
        throw new ErroDeConversaoDeDadosException("Não foi possível converter os dados dos atributos para JSON");
    }

    }
}
