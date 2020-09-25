package Food;

public abstract class Drinkings extends Food {
    Double alcoPercentage;

    public Drinkings(String name, Double price, Integer foodId, Double alcoPercentage) {
        super(name, price, foodId);
        this.alcoPercentage = alcoPercentage;
    }
}
