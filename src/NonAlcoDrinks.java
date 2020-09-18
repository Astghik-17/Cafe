public class NonAlcoDrinks extends Drinkings{
    boolean isCarbonated;

    public NonAlcoDrinks(boolean isBarFood, String name, Double price, Integer number, Double alcoPercentage, boolean isCarbonated) {
        super(isBarFood, name, price, number, 0.0);
        this.isCarbonated = isCarbonated;
    }
}
