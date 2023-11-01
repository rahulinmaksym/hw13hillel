package task3;

public record Product(String type, double price, boolean discountable) {

    @Override
    public String toString() {
        return "Product type: " + type +
                ", price: " + price +
                ", discountable: " + discountable;
    }
}
