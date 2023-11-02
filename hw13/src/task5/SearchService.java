package task5;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SearchService {

    public double generalPrice(List<Product> initialProductList) throws NoSuchCategoryException {
        List<Product> bookList = initialProductList.stream()
                .filter(product -> Objects.equals(product.type(), "Book"))
                .collect(Collectors.toList());
        if(!bookList.isEmpty()) {
            return bookList.stream()
                    .filter(book -> book.dateTime().getYear() == LocalDateTime.now().getYear() && book.price() <= 75)
                    .mapToDouble(Product::price)
                    .sum();
        }
        else {
            throw new NoSuchCategoryException("Book");
        }
    }
}
