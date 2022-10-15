package Heranca.Exercicio2;

import java.util.Date;

public class UsedProduct extends Product{

    private Date manufactureDate;

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
}
