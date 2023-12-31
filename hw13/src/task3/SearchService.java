package task3;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SearchService {

    public Product findTheCheapestBook(List<Product> initialProductList) throws NoSuchCategoryException {
        List<Product> bookList = initialProductList.stream()
                .filter(product -> Objects.equals(product.type(), "Book"))
                .collect(Collectors.toList());
        if(!bookList.isEmpty()) {
            return bookList.stream()
                    .min(Comparator.comparingDouble(Product::price))
                    .get();
        }
        else {
            throw new NoSuchCategoryException("Book");
        }
    }
}
