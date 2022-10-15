package Heranca.Exercicio1.Entities;

public class Employee {
    private String name;
    private int hour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    private double valuePerHour;

    public Employee(String name, int hour, double valuePerHour) {
        this.name = name;
        this.hour = hour;
        this.valuePerHour = valuePerHour;
    }

    public double payment(){
        return this.valuePerHour * hour;
    }
}
