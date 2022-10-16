package TryCatch.code;

import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            String[] vect = scan.nextLine().split(" ");
            int position = Integer.parseInt(scan.next());

            System.out.println(vect[position]);
        }
        catch (NumberFormatException joaima){
            System.out.println("Informacao invalida");
            joaima.printStackTrace();

        }
        catch (Exception e){ //o catch gera um break, então se a excecao entrar em um bloco acima, ela nao ira se propagar para os demais
            System.out.println("teste");
        }
        finally {
            System.out.println("Fim do programa");
            scan.close();
        }


    }
}
