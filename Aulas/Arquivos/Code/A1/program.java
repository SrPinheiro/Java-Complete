package Arquivos.Code.A1;

import java.io.File;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        //File sera responsafel por armazenar o arquivo
        File file = new File("/home/srpinheiro/MEGA/Java-Complete/Aulas/Arquivos/Code/A1/file");

        Scanner scan = null;

        try{
            scan = new Scanner(file);

            while (scan.hasNext()){
                System.out.println(scan.nextLine());
            }

        }catch (Exception e){

        }finally {
            if(scan != null)
                scan.close();
        }


    }
}
