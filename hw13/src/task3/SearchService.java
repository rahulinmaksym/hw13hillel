package task3;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SearchService {

    // Не знаю, чи треба було враховувати знижку в 10%, однак я вирішив її таки врахувати
    public Product findTheCheapestBook(List<Product> initialProductList) throws NoSuchCategoryException {
        List<Product> bookList = initialProductList.stream()
                .filter(product -> Objects.equals(product.type(), "Book") && product.discountable())
                .map(book -> new Product("Book", book.price() * 0.9, true))
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
