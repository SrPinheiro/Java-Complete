package Arquivos.Code.A3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {

        //Bloco try-with-resources
        //• É um bloco try que declara um ou mais recursos, e garante que esses
        //recursos serão fechados ao final do bloco
        //• Disponível no Java 7 em diante
        //• https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html


        String path = "/home/srpinheiro/MEGA/Java-Complete/Aulas/Arquivos/Code/file";

        try (BufferedReader BF = new BufferedReader(new FileReader(path))){

            String line = BF.readLine();

            while (line != null){
                System.out.println(line);
                line = BF.readLine();
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
            //
        }
    }
}
