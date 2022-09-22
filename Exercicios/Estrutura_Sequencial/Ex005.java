package Estrutura_Sequencial;

import java.util.Scanner;

public class Ex005 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        cod1 = scan.nextInt();
        qte1 = scan.nextInt();
        preco1 = scan.nextDouble();

        cod2 = scan.nextInt();
        qte2 = scan.nextInt();
        preco2 = scan.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        scan.close();
    }
}
