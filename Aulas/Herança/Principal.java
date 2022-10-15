package Herança;

public class Principal {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Leo", 100);
        BusinessAccount bAcc = new BusinessAccount(1002, "Larissa", 0.0, 500.0);
        Account acc$ = new SavingsAccount();


        //Fazendo UpCasting
        Account acc1 = bAcc;
        Account acc2 = new BusinessAccount();



        //fazer DownCasting
        BusinessAccount bAcc1 = (BusinessAccount) acc;
        BusinessAccount bAcc2 = (BusinessAccount) new Account();

        //ClassCastException o compilador não consegue realizar esta conversão
        if(acc$ instanceof BusinessAccount){
            BusinessAccount bAcc999 = (BusinessAccount) acc$;
            System.out.println("É uma instancia da classe!");
        }else{
            System.out.println("Não é uma instancia da classe!");
        }
    }
}
