package exceptions.Exercicio03;

import java.io.FileWriter;
import java.io.IOException;

/*Crie um programa em Java que escreva a seguinte mensagem em um arquivo
chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.*/
public class Main {
    static void main(String[] args) throws IOException {

        String conteudo = "Conteúdo a ser gravado no arquivo.";

        try {
            FileWriter file = new FileWriter("arquivo.txt");
            file.write(conteudo);
            System.out.println("Dados gravados com sucesso!");
            file.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
