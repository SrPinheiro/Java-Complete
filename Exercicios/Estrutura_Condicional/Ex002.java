package Estrutura_Condicional;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
         */

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
