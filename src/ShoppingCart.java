import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items=new ArrayList<Item>();
    }
    public void addProduct(Item item) {
        items.add(item);
        System.out.println("Added product: " + item.getName() + " to the cart.");
    }

    public void displayCart() {
        System.out.println("Products in the cart:");
        for (Item item : items) {
            System.out.println("Name: " + item.getName() + ", Price: " + item.getPrice() + ", Quantity: " + item.getQty());
        }
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal () {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
