public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item("Product", 50, 2);
        cart.addProduct(item);
        cart.displayCart();

        cart.pay(new CreditCardStrategy("Dariya Serikova", "792837583759", "786", "12/24"));
        cart.pay(new PaypalStrategy("dariya@gmail.com", "jfoiewjoiefj"));

    }
}

