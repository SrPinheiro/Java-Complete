package Sobrescrita.Codigo;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(){

    }

    public BusinessAccount(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BusinessAccount(Integer number, String holder, double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit){
            this.deposit(amount);
        }
    }
    @Override
    public void withdraw(double amount){
        this.balance -= amount + 5;
        balance -= 2;
    }

}
