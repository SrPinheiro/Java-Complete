package Estrutura_Sequencial;

import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, horas;
        double valorHora, salario;

        numero = scan.nextInt();
        horas = scan.nextInt();
        valorHora = scan.nextDouble();

        salario = valorHora * horas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        scan.close();
    }
}
