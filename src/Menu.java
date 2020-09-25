import Food.Food;

import java.util.List;

public class Menu {
    static List<Food> menuItems;

    public Menu(List<Food> menuItems){
        this.menuItems = menuItems;
    }

    public void printMenu(){
        for (Food item: menuItems){
            System.out.println(item + "\t");
        }
    }

    static Food getFoodById(int id){
        for (Food item: menuItems){
            if (item.getFoodId() == id){
                return item;
            }
        }
        return null;
    }

}