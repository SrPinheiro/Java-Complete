package Heranca.Exercicio1;

import Heranca.Exercicio1.Entities.Employee;
import Heranca.Exercicio1.Entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Employee> EmployeeList = new ArrayList<>();

        while(true){
            try {
                System.out.println("Digite o nome do funcionario:");
                String name = scan.nextLine();

                System.out.println("Dogote o tipo do Funcionario:\n1: Funcionario\n2: Funcionario Terceirizado");
                byte type = Byte.parseByte(scan.nextLine());

                System.out.println("Digite a quantidade de horas trabalhadas:");
                int hour = Integer.parseInt(scan.nextLine());

                System.out.println("Digite o valor por hora trabalhada:");
                double value = Double.parseDouble(scan.nextLine());

                if (type == 1) {
                    EmployeeList.add(new Employee(name, hour, value));

                } else if (type == 2) {
                    System.out.println("Digite o valor adicional do funcionario:");
                    double additionalValue = Double.parseDouble(scan.nextLine());

                    EmployeeList.add(new OutSourcedEmployee(name, hour, value, additionalValue));
                }

                System.out.println("Funcionario Cadastrado!\nDeseja adicionar mais um?\n1-Sim\n2-Não");
                int option = Integer.parseInt(scan.nextLine());

                if (option == 2) {
                    break;
                }
            }catch (Exception e ){
                System.out.println("Erro");
            }
        }

        System.out.println("--------------------");
        System.out.println("Resultado Final dos Funcionarios:");
        System.out.println();

        for(var object : EmployeeList){
            System.out.printf("Nome: %s\n", object.getName());
            System.out.printf("Horas: %s\n", object.getHour());
            System.out.printf("Valor/Hora: %S\n", object.getValuePerHour());
            if(object instanceof OutSourcedEmployee obj)
                System.out.printf("Salario Adicional: %s\n", obj.getAdditionalCharge());
            System.out.printf("Salario: %s\n\n", object.payment());

        }
        System.out.println("--------------------");
    }
}
