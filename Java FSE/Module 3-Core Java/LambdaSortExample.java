import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        // Sort using a lambda expression (case-insensitive)
        Collections.sort(fruits, (s1, s2) -> s1.compareToIgnoreCase(s2));

        System.out.println("Sorted list: " + fruits);
    }
}