package TryCatch.code;

import java.io.File;
import java.util.Scanner;

public class Arquivos {
    public static void main(String[] args) {
        File file = new File("/home/srpinheiro/MEGA/Java-Complete/Aulas/TryCatch/code/ArquivoTeste.txt");

        Scanner scan = null;
        try {
            scan = new Scanner(file);

            while(scan.hasNext()){
                System.out.print(scan.nextLine() + " 1\n");

            }
        } catch (Exception e) {
            System.out.printf("Error: %s\n", e.getMessage());

        } finally {
            if(scan != null){
                scan.close();
            }
        }
    }
}
