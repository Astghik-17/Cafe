import Food.Food;

public class OrderItems  extends Food {
    Integer orderCount;

    public OrderItems(Food orderItem, Integer orderCount){
        super(orderItem.getName(), orderItem.getPrice(), orderItem.getFoodId());
        this.orderCount = orderCount;
    }

    public Integer getOrderCount() {
        return orderCount;
    }
}
