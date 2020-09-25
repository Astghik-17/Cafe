package Food;

public abstract class Food {
    String name;
    Double price;
    Integer foodId;

    public Food(String name, Double price, Integer foodId) {
        this.name = name;
        this.price = price;
        this.foodId = foodId;
    }

    public String getName(){
        return name;
    }

    public Double getPrice(){
        return price;
    }

    public Integer getFoodId(){
        return foodId;
    }

    public String toString() {
        return String.format("%d. %-20s %.2f AMD", foodId, name, price);
    }
}
