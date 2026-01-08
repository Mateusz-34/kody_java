public class Electronics extends Product implements Discountable {
    private String brand;

    public Electronics(String id, String name, double price, String brand) {
        super(id, name, price);
        this.brand = brand;
    }

    @Override
    public void applyDiscount(double percent) {
        price = price - price * percent / 100;
    }

    @Override
    public String getInfo() {
        return String.format("Electronics [ID:%s,name: %s,brand: %s,price: %.2f]", id, name, brand, price);
    }
}
