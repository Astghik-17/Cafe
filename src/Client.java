import java.util.Scanner;
import Food.*;

public class Client {
        private final Scanner scanner = new Scanner(System.in);

        public Order placeOrder(Menu menu) {
            Order order = new Order();
            readInput(order, menu);
            return order;
        }

        private void readInput(Order order, Menu menu) {
            System.out.println("Please input your order. To finish input 0.");
            int id, quantity;
            while (true) {
                System.out.print("Menu item number: ");
                id = scanner.nextInt();
                if (id == 0) break;
                Food orderitem = Menu.getFoodById(id);
                if(orderitem == null){
                    System.out.println("Invalid menu item!");
                    continue;
                }

                System.out.print("quantity: ");
                quantity = scanner.nextInt();
                if (quantity == 0) break;

                order.makeOrder(orderitem);
            }
        }
}
