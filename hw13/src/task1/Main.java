package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SearchService searchService = new SearchService();

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Book", 500));
        productList.add(new Product("Book", 250));
        productList.add(new Product("Book", 100));
        productList.add(new Product("Pump", 600));
        productList.add(new Product("Book", 150));
        productList.add(new Product("Book", 300));
        productList.add(new Product("Book", 200));
        productList.add(new Product("Lamp", 300));
        productList.add(new Product("Book", 100));
        productList.add(new Product("Book", 600));
        productList.forEach(System.out::println);
        System.out.println();

        List<Product> newProductList = searchService.findBooksAbove250(productList);
        newProductList.forEach(System.out::println);
    }
}
