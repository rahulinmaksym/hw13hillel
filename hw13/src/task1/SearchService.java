package task1;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SearchService {

    public List<Product> findBooksAbove250(List<Product> initialProductList) {
        return initialProductList.stream()
                .filter(product -> Objects.equals(product.type(), "Book") && product.price() >= 250)
                .collect(Collectors.toList());
    }
}
