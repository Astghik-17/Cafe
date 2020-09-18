public abstract class AlcoDrinks extends Drinkings{
    boolean hasIngredients;

    public AlcoDrinks(boolean isBarFood, String name, Double price, Integer number, Double alcoPercentage, boolean hasIngredients) {
        super(isBarFood, name, price, number, alcoPercentage);
        this.hasIngredients = hasIngredients;
    }
}
