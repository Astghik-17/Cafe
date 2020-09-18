import java.util.List;

public class Menu {
    List<Food> menuItems;

    public Menu(List<Food> menuItems){
        this.menuItems = menuItems;
    }

    public List<Food> getMenuItems(){
        return menuItems;
    }

}