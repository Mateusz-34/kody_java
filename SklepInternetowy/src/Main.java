public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Book book = new Book("B001", "Potop", 49.99, "Henryk Sienkiewicz");
        Electronics phone = new Electronics("E001", "Iphone 18 Pro Pro", 799.99, "Apple");
        Clothing tshirt = new Clothing("C001", "Bluza z kapturem", 109.99, "XL");

        cart.addProduct(book);
        cart.addProduct(phone);
        cart.addProduct(tshirt);

        System.out.println("Przed zniżką:");
        cart.showCart();

        cart.applyDiscounts(10);
        System.out.println("\nPo zastosowaniu 10% zniżki:");
        cart.showCart();
    }
}
