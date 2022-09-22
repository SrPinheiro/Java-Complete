import java.util.Scanner;

public class Ex001 {
    /*
    Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    mensagem explicativa, conforme exemplos.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A, B, soma;

        A = scan.nextInt();
        B = scan.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

        scan.close();
    }
}