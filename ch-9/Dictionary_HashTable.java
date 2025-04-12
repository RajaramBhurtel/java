import java.util.Hashtable;

public class Dictionary_HashTable {
    public static void main(String[] args) {
        // Create a Hashtable (Dictionary)
        Hashtable<Integer, String> hash = new Hashtable<>();
        
        // 1. put(key,value) - Add elements to hashtable
        System.out.println("--- Adding elements ---");
        hash.put(1, "beer");
        hash.put(2, "tea");
        hash.put(5, "Coffee");
        hash.put(3, "juice");  // Added more elements for demonstration
        System.out.println("Hashtable contents: " + hash);
        
        // 2. get(key) - Retrieve value by key
        System.out.println("\n--- Accessing elements ---");
        System.out.println("Value for key 5: " + hash.get(5));
        System.out.println("Value for non-existent key 10: " + hash.get(10));
        
        // 3. remove(key) - Remove element by key
        System.out.println("\n--- Removing elements ---");
        System.out.println("Removing element with key 2: " + hash.remove(2));
        System.out.println("Hashtable after removal: " + hash);
        
        // 4. size() - Get hashtable size
        System.out.println("Current size: " + hash.size());
        
        // 5. isEmpty() - Check if hashtable is empty
        System.out.println("Is hashtable empty? " + hash.isEmpty());
        
        // 6. containsKey() - Check if key exists (additional useful method)
        System.out.println("\n--- Checking keys ---");
        System.out.println("Contains key 1? " + hash.containsKey(1));
        System.out.println("Contains key 2? " + hash.containsKey(2));
        
        // 7. clear() - Clear all elements
        System.out.println("\n--- Clearing hashtable ---");
        hash.clear();
        System.out.println("Hashtable after clear: " + hash);
        System.out.println("Is hashtable empty now? " + hash.isEmpty());
    }
}