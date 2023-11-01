package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SearchService searchService = new SearchService();

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Book", 500, true));
        productList.add(new Product("Book", 250, false));
        productList.add(new Product("Book", 100, true));
        productList.add(new Product("Pump", 600, false));
        productList.add(new Product("Book", 150, true));
        productList.add(new Product("Book", 300, false));
        productList.add(new Product("Book", 200, true));
        productList.add(new Product("Lamp", 300, false));
        productList.add(new Product("Book", 100, true));
        productList.add(new Product("Book", 600, false));
        productList.forEach(System.out::println);
        System.out.println();

        List<Product> newProductList = searchService.findDiscountableBooks(productList);
        newProductList.forEach(System.out::println);
    }
}
