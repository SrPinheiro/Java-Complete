package Estrutura_Sequencial;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A, B, C, D, dif;

        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();

        dif = A * B - C * D;

        System.out.println("DIFERENCA = " + dif);

        scan.close();
    }
}
