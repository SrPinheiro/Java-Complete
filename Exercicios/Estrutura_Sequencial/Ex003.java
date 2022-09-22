package Estrutura_Sequencial;

import java.util.Scanner;

public class Ex003 {
    /*
    Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
    de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
     */
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
