import java.util.Arrays;
import java.util.List;

public class CafeMain {

    private static java.util.List<Food> List;

    public static void main(String[] args){
        String ing1 = "Ing1", ing2 = "Ing2";
        Food coctail1 = new Coctails(false,"Mojito",1200.0, 1, 5.0, true,Arrays.asList(ing1, ing2));
        Food water = new NonAlcoDrinks(true, "Water", 200.0,2,0.0, false);
        Menu menu = new Menu(Arrays.asList(coctail1));

        System.out.println(coctail1.isBarFood);
        System.out.println(coctail1.name);
        System.out.println(coctail1.price);
        System.out.println(coctail1.number);
        System.out.println(((Coctails) coctail1).alcoPercentage);
        System.out.println(((Coctails) coctail1).hasIngredients);
        ((Coctails) coctail1).ingredients.forEach(System.out::println);

    }
}
