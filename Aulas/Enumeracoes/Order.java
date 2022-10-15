package Enumeracoes;

import java.time.LocalDateTime;

public class Order {
    private int ID;
    private LocalDateTime moment;
    private OrderStatus status;

    public Order(int ID, LocalDateTime moment, OrderStatus status) {
        this.ID = ID;
        this.moment = moment;
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("ID=").append(ID);
        sb.append(", moment=").append(moment);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
