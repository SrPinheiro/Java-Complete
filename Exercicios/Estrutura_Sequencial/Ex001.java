import java.util.Scanner;

public class Ex001 {

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