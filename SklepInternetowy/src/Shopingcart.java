import java.util.ArrayList;import java.util.List;

class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void applyDiscounts(double percent) {
        for (Product p : products) {
            if (p instanceof Discountable) {
                ((Discountable) p).applyDiscount(percent);
            }
        }
    }

    public void showCart() {
        System.out.println("Twój koszyk:");
        for (Product p : products) {
            System.out.println(p.getInfo());
        }
    }
}
