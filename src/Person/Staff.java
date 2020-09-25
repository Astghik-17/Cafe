package Person;

import Food.Food;

public abstract class Staff extends Person{
    String checkIn, checkOut;
    double salary;

    public Staff(String name, int age, String gender, String checkIn, String checkOut, double salary){
        super(name, age, gender);
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public abstract void makeFood(Food item);

    public abstract void done(Food item);
}
