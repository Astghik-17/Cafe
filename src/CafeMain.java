import Food.*;
import java.util.Arrays;

public class CafeMain {

    private static java.util.List<Food> List;

    public static void main(String[] args){
        String ing1 = "Ing1", ing2 = "Ing2";
        Food coctail1 = new Coctails("Mojito", 2000.0, 1, 13.0, Arrays.asList(ing1, ing2));
        Food justDrink1 = new JustDrinks("Beer", 1800.0, 2, 20.0);
        Food juice1 = new NonAlcoDrinks("Juice", 1200.0, 3, 0.0);
        Food meal1 = new Meals("Burger", 1800.0, 4);
        Food dessert1 = new Desserts("Ice Cream", 1500.0, 5);
        Menu menu = new Menu(Arrays.asList(coctail1, justDrink1, juice1, meal1, dessert1));

        menu.printMenu();

        Client client1 = new Client();
        client1.placeOrder(menu);
    }
}
