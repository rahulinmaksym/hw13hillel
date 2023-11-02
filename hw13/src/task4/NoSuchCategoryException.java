package task4;

public class NoSuchCategoryException extends Exception {
    public NoSuchCategoryException(String category) {
        super("Product [category: " + category + "] not found.");
    }
}
