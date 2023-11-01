package task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SearchService searchService = new SearchService();
        Product theCheapestBook;

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

        try {
            theCheapestBook = searchService.findTheCheapestBook(productList);
            System.out.println(theCheapestBook.toString() + "\n");
        } catch(NoSuchCategoryException e) {
            System.out.println(e.getMessage());
        }

        List<Product> newProductList = new ArrayList<>();
        newProductList.add(new Product("Pump", 600, true));
        newProductList.add(new Product("Lamp", 300, false));
        newProductList.add(new Product("Lamp", 250, true));
        newProductList.add(new Product("Pump", 900, false));
        newProductList.forEach(System.out::println);
        System.out.println();

        try {
            theCheapestBook = searchService.findTheCheapestBook(newProductList);
            System.out.println(theCheapestBook.toString());
        } catch(NoSuchCategoryException e) {
            System.out.println(e.getMessage());
        }
    }
}
