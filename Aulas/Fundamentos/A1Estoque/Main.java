import Entities.Product;

public class Main {
    public static void main(String[] args) {
        try {
            Product p1 = new Product("SBP", 125);

            p1.addItem(50);
            System.out.printf("---------------------\n");
            p1.addItem();

            Main m1 = new Main();

            m1.teste();

            System.out.printf("---------------------\n");
            p1.setPrice(2);
            p1.addItem();
        }catch (Exception e){
            //
        }
    }

    public void teste(){
        try{
            wait(506546546546540000L, 2000);
        }catch (Exception e){
            //
        }
    }

}
