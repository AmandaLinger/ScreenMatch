package exercícios.ex35;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoMensagemNoArquivo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("arquivo.txt");
        fw.write("Conteúdo a ser gravado no arquivo.");
        fw.close();
        System.out.println("O programa finalizou corretamente");
    }
}
