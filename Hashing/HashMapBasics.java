import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        // Insert key-value pairs
        students.put(101, "Rahul");
        students.put(102, "Priya");
        students.put(103, "Arjun");

        // Access value using key
        System.out.println("Student 101: " + students.get(101));

        // Update existing value
        students.put(102, "Sneha");

        // Check whether a key exists
        System.out.println("Contains key 103: " + students.containsKey(103));

        // Check whether a value exists
        System.out.println("Contains value Arjun: " + students.containsValue("Arjun"));

        // Remove a key-value pair
        students.remove(101);

        // Traverse HashMap
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Number of entries
        System.out.println("Size: " + students.size());

        // Check whether map is empty
        System.out.println("Is empty: " + students.isEmpty());
    }
}
