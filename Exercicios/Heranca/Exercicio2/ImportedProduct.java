package Heranca.Exercicio2;

public class ImportedProduct extends Product{
    private double customsFree;


    public ImportedProduct(String name, double price, double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    @Override
    public String priceTag(){
        return super.priceTag() +
                "Taxa: " +
                this.customsFree +
                "\n" +
                "Preco Final: " +
                this.totalPrice();
    }

    public Double totalPrice(){
        return super.getPrice() + customsFree;
    }
}

