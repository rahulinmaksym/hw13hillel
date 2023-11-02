package task5;

import java.time.LocalDateTime;

public record Product(String type, double price, boolean discountable, LocalDateTime dateTime) {

    @Override
    public String toString() {
        return "Product type: " + type +
                ", price: " + price +
                ", discountable: " + discountable +
                ", date and time: " + dateTime.toString();
    }
}
