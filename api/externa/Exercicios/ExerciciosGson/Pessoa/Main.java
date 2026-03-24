package api.externa.Exercicios.ExerciciosGson.Pessoa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*1 - Crie uma classe Pessoa usando o conceito de Record em Java, com atributos
como nome, idade e cidade. Em seguida, implemente um programa que utiliza a
biblioteca Gson para converter um JSON representando uma pessoa em um objeto do tipo Pessoa.

2 - Modifique o programa para permitir a conversão de um JSON mesmo se
alguns campos estiverem ausentes ou se houver campos adicionais não representados no objeto
Pessoa. Consulte a documentação da biblioteca Gson para flexibilizar a conversão.

*/
public class Main {
    static void main(String[] args) {
        //(parte do exercício 1)
        //String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";
        System.out.println(jsonPessoa);

        //(parte do exercício 1)
        //Gson gson = new Gson();
        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
