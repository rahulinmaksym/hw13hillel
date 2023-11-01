package task1;

public record Product(String type, double price) {

    @Override
    public String toString() {
        return "Product type: " + type + ", price: " + price;
    }
}
