import java.util.List;

public class MenuItems {
    List<Food> menuItems;

    public MenuItems(List<Food> menuItems){
        this.menuItems = menuItems;
    }

    public List<Food> getMenuItems(){
        return menuItems;
    }
}
