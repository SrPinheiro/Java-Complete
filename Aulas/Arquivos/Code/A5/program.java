package Arquivos.Code.A5;

import java.io.File;

public class program {
    public static void main(String[] args) {
        File file = new File("/home/srpinheiro/MEGA/Java-Complete/Aulas");

        File[] listFiles = file.listFiles(File::isDirectory);

        System.out.println(listFiles.length);

        for(var obj: listFiles){
            System.out.println(obj.toString());
        }
    }
}
