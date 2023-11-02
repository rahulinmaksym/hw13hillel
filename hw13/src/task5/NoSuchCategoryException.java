package task5;

public class NoSuchCategoryException extends Exception {
    public NoSuchCategoryException(String category) {
        super("Product [category: " + category + "] not found.");
    }
}
