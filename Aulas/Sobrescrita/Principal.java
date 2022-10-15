package Sobrescrita;

import Sobrescrita.Codigo.Account;
import Sobrescrita.Codigo.BusinessAccount;
import Sobrescrita.Codigo.SavingsAccount;

public class Principal {
    /*
        A sobrescrita(ou Sobreposição) é a implementação de um metodo da super classe na subClasse
        Recomendado utilizar o @Override pois facilita na leitura do codigo e ainda ajuda o compilador(boa pratica)
     */

    public static void main(String[] args) {
        Account acc1 = new Account(1001, "leo", 1000.0);

        acc1.withdraw(200);//ira fazer o saque de 200 reais + 5 reais de juros
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Larissa", 1000.0, 0.01);
        acc2.withdraw(200);// ira realizar apenas o saque de 200 reais
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Prefeitura", 1000, 2000.0);
        acc3.withdraw(200); // ira realizar o saque de 200 + 5 reais de juros + 2 reais da sobrescrita!
        System.out.println(acc3.getBalance());
        String teste;

    }
}
