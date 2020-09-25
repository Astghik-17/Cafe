package Person;

import Food.Food;

public class Cook extends Staff{

    public Cook(String name, int age, String gender, String checkIn, String checkOut, double salary) {
        super(name, age, gender, "10:00", "20:00", salary);
    }

    @Override
    public void makeFood(Food item) {
        System.out.println("Cook is making" + item);
    }

    @Override
    public void done(Food item) {
        System.out.println(item + "is done.");
    }
}
