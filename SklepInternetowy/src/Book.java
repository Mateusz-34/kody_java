public class Book extends Product implements Discountable {
    private String author;

    public Book(String id, String name, double price, String author) {
        super(id, name, price);
        this.author = author;
    }

    @Override
    public void applyDiscount(double percent) {
        price = price - price * percent / 100;
    }

    @Override
    public String getInfo() {
        return String.format("Book [ID:%s,name: %s,author: %s,price: %.2f]", id, name, author, price);
    }
}
