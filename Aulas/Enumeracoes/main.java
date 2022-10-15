package Enumeracoes;

import java.time.LocalDateTime;

public class main {
    public static void main(String[] args) {
        Order ordem = new Order(50, LocalDateTime.now(), OrderStatus.PROCESSING);
        System.out.println(ordem);

        //convertendo String para enum
        OrderStatus orderStatus1 = OrderStatus.valueOf("DELIVERED");
        System.out.println(orderStatus1);



    }
}
