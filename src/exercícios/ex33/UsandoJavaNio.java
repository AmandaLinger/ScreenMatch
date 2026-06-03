package exercícios.ex33;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsandoJavaNio {
    public static void main(String[] args) {
        try{
            Path path = Paths.get("C:\\Users\\Taki\\Documents\\treinandoJava\\aula-java.txt");

            byte[] bitesArquivo = Files.readAllBytes(path); //lendo o conteúdo do arquivo
            String conteudo = new String(bitesArquivo);
            System.out.println(conteudo);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
