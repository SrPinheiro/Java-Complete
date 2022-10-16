package Arquivos.Code.A2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {
        String path = "/home/srpinheiro/MEGA/Java-Complete/Aulas/Arquivos/Code/file";
        FileReader FR = null;
        BufferedReader BF = null;

        try{

            //BF = new BufferedReader(new FileReader(path));
            FR = new FileReader(path);
            BF = new BufferedReader(FR);

            String line = BF.readLine();

            while (line != null){
                System.out.println(line);
                line = BF.readLine();
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
            //
        }finally {
            try{
                if(BF != null)
                    BF.close();

                if(FR != null)
                    FR.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
