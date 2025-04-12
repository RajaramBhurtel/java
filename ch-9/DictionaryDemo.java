import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration; // Required for Enumeration

public class DictionaryDemo {
    public static void main(String[] args) {
        // Initialize (Dictionary is abstract, so we use Hashtable)
        Dictionary<String, String> dict = new Hashtable<>();

        // 1. Add elements
        dict.put("1", "Java");
        dict.put("2", "Python");
        dict.put("3", "C++");

        // 2. Retrieve elements
        System.out.println(dict.get("1")); // Output: Java

        // 3. Remove an element
        dict.remove("2");

        // 4. Check size
        System.out.println("Size: " + dict.size()); // Output: 2

        // 5. Iterate using Enumeration
        System.out.println("\nKeys:");
        Enumeration<String> keys = dict.keys();
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }

        // 6. Clear the Dictionary by creating a new Hashtable
        dict = new Hashtable<>(); // Alternative to clear()
        System.out.println("Is empty? " + dict.isEmpty()); // Output: true
    }
}