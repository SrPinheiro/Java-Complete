package Heranca.Exercicio1.Entities;

public class OutSourcedEmployee extends Employee{

    private double additionalCharge;

    public OutSourcedEmployee(String name, int hour, double valuePerHour, double additionalCharge) {
        super(name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    @Override
    public double payment(){
        return  super.payment() + this.additionalCharge * 1.1;
    }

}
