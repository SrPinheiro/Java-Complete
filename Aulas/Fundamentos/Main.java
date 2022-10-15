package Fundamentos;


import Fundamentos.Entities.Product;

public class Main {
    public static void main(String[] args) {
        try {
            Product p1 = new Product("SBP", 125);

            p1.addItem(50);
            System.out.printf("---------------------\n");
            p1.addItem();

            System.out.printf("---------------------\n");
            p1.setPrice(2);
            p1.addItem();
        }catch (Exception e){
            //
        }
    }

}
