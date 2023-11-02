package task4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SearchService {

    public List<Product> threeLastProducts(List<Product> initialProductList) throws NoSuchCategoryException {

        return initialProductList.stream()
                .sorted(Comparator.comparing(Product::dateTime).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
