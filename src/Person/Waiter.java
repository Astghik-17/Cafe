package Person;

import Food.Food;
import Food.Meals;

public class Waiter extends Staff{

    public Waiter(String name, int age, String gender, String checkIn, String checkOut, double salary) {
        super(name, age, gender, "12:00", "22:00", salary);
    }

    @Override
    public void makeFood(Food item) {
        System.out.print("Water takes order to the ");
        if (item instanceof Meals){
            System.out.println("Kitchen");
        }
        else {
            System.out.println("Bar");
        }
    }

    @Override
    public void done(Food item) {
        System.out.println("Waiter serves " + item);
    }
}
