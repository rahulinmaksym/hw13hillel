package task4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        SearchService searchService = new SearchService();

        List<Product> productList = new ArrayList<>();
        try {
            productList.add(new Product("Book", 500, true, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Book", 250, false, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Book", 100, true, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Pump", 600, false, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Book", 150, true, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Book", 300, false, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Book", 200, true, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Lamp", 300, false, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Book", 100, true, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Book", 600, false, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        productList.forEach(System.out::println);
        System.out.println();

        try {
            List<Product> newProductList = searchService.threeLastProducts(productList);
            newProductList.forEach(System.out::println);
        } catch(NoSuchCategoryException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}
