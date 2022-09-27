package Aulas.Fundamentos.A1Estoque.Entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price){
        this(name, price, 0);
    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void addItem(){
        this.addItem(1);
    }

    public void addItem(int quantity){
        this.quantity += quantity;

        System.out.printf("Product: %s\n", this.name);
        System.out.printf("Price: %s\n", this.price);
        System.out.printf("Quantity: %s\n", this.quantity);
        System.out.printf("Total Value: %s\n", this.quantity * this.price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
