import Food.Food;

import java.util.List;

public class Order {
    int orderId;
    List<Food> order;

    public void makeOrder(Food orderItem){
        order.add(orderItem);
    }
}
