public class Clothing extends Product implements Discountable {
    private String size;

    public Clothing(String id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    public void applyDiscount(double percent) {
        price = price - price * percent / 100;
    }

    @Override
    public String getInfo() {
        return String.format("Clothing [ID:%s,name: %s,size: %s,price: %.2f]", id, name, size, price);
    }
}
