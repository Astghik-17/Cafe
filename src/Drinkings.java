public abstract class Drinkings extends Food {
    Double alcoPercentage;

    public Drinkings(boolean isBarFood, String name, Double price, Integer number, Double alcoPercentage) {
        super(true, name, price, number);
        this.alcoPercentage = alcoPercentage;
    }
}
