import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Shoes", "Footwear"),
            new Product(4, "Backpack", "Accessories"),
            new Product(5, "Watch", "Accessories")
        };

        // Linear Search Test
        System.out.println("Linear Search Result:");
        Product result1 = SearchUtil.linearSearch(products, "Shoes");
        System.out.println(result1 != null ? result1 : "Product not found");

        // Sort for Binary Search
        Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));

        // Binary Search Test
        System.out.println("\nBinary Search Result:");
        Product result2 = SearchUtil.binarySearch(products, "Shoes");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
