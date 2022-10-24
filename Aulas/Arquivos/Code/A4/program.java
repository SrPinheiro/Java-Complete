package Arquivos.Code.A4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class program {
    public static void main(String[] args) {
        String[] lines = new String[] {"Leonardo", "Larissa", "Joana", "Loguito", "lalaia", "Felipe"};

        String PATH = "/home/srpinheiro/MEGA/Java-Complete/Aulas/Arquivos/Code/A4/file.txt";

        try(BufferedWriter BF = new BufferedWriter(new FileWriter(PATH))){ //Colocando o true ele vai acrescentar as informações nos arquivos
            for( var line: lines){
                BF.write(line);
                BF.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
