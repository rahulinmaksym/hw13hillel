package task5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SearchService searchService = new SearchService();

        List<Product> productList = new ArrayList<>();
        try {
            productList.add(new Product("Book", 50, true, LocalDateTime.of(2014, 9, 19, 14, 5, 20)));
            productList.add(new Product("Book", 250, false, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Book", 100, true, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Pump", 60, false, LocalDateTime.of(2014, 9, 19, 14, 5, 25)));
            productList.add(new Product("Book", 150, true, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Book", 75, false, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Book", 200, true, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Lamp", 30, false, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Book", 10, true, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
            productList.add(new Product("Book", 60, false, LocalDateTime.now()));
            TimeUnit.SECONDS.sleep(1);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        productList.forEach(System.out::println);
        System.out.println();

        try {
            System.out.println("General price is: " + searchService.generalPrice(productList));
        } catch(NoSuchCategoryException e) {
            System.out.println(e.getMessage());
        }
    }
}
