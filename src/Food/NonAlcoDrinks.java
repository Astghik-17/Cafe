package Food;

public class NonAlcoDrinks extends Drinkings{

    public NonAlcoDrinks(String name, Double price, Integer foodId, Double alcoPercentage) {
        super(name, price, foodId, 0.0);
    }
}
