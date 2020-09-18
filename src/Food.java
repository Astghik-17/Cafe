public abstract class Food {
    boolean isBarFood;
    String name;
    Double price;
    Integer number;

    public Food(boolean isBarFood, String name, Double price, Integer number) {
        this.isBarFood = isBarFood;
        this.name = name;
        this.price = price;
        this.number = number;
    }

}
