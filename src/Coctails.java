import java.util.List;

public class Coctails extends AlcoDrinks {
    List<String> ingredients;

    public Coctails(boolean isBarFood, String name, Double price, Integer number, Double alcoPercentage, boolean hasIngredients, List<String> ingredients) {
        super(isBarFood, name, price, number, alcoPercentage, true);
        this.ingredients = ingredients;
    }
}
