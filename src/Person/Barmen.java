package Person;

import Food.Food;

public class Barmen extends Staff {

    public Barmen(String name, int age, String gender, String checkIn, String checkOut, double salary) {
        super(name, age, gender, "12:00", "22:00", salary);
    }

    @Override
    public void makeFood(Food item) {
        System.out.println("Barmen is making " + item);
    }

    @Override
    public void done(Food item) {
        System.out.println(item + "is done.");
    }
}
