package Food;

import java.util.List;

public class Coctails extends AlcoDrinks {
    List<String> ingredients;

    public Coctails(String name, Double price, Integer foodId, Double alcoPercentage, List<String> ingredients) {
        super(name, price, foodId, alcoPercentage);
        this.ingredients = ingredients;
    }
}
