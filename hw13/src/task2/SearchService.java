package task2;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SearchService {

    public List<Product> findDiscountableBooks(List<Product> initialProductList) {
        return initialProductList.stream()
                .filter(product -> Objects.equals(product.type(), "Book") && product.discountable())
                .map(book -> new Product("Book", book.price() * 0.9, true))
                .collect(Collectors.toList());
    }
}
