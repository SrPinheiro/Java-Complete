package Heranca.Exercicio2;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ");
        sb.append(this.getName());
        sb.append("\n");
        sb.append("Preco: ");
        sb.append(this.getPrice());

        return sb.toString();
    }

    public String getName() {
        return name;
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
}
