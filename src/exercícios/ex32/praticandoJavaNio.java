package exercícios.ex32;

import java.io.File;
import java.io.IOException;

public class praticandoJavaNio {
    public static void main(String[] args) {
        File diretorio = new File("C:\\Users\\Taki\\Documents\\treinandoJava");
        System.out.println("Diretorio existe? " + diretorio.exists());
        if(!diretorio.exists()){
            diretorio.mkdirs(); //criando um(ou mais de um) diretorios novos
            System.out.println("Foi criado um novo diretório");
        }
        try{
            File arquivo = new File(diretorio, "aula-java.txt");
            System.out.println(arquivo.exists());

            arquivo.createNewFile();
            System.out.println(arquivo.exists());

        } catch (IOException e) {
            e.printStackTrace();
        }
        File arquivo = new File("C:\\Users\\Taki\\Documents");
    }
}
