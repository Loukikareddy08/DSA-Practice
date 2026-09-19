import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Duplicate - ignored

        System.out.println("HashSet: " + numbers);

        // Check whether an element exists
        System.out.println("Contains 20: " + numbers.contains(20));

        // Remove an element
        numbers.remove(10);

        // Traverse HashSet
        System.out.println("Elements:");

        for (int number : numbers) {
            System.out.println(number);
        }

        // Number of elements
        System.out.println("Size: " + numbers.size());

        // Check whether empty
        System.out.println("Is empty: " + numbers.isEmpty());

        // Clear all elements
        numbers.clear();

        System.out.println("After clear: " + numbers);
    }
}
