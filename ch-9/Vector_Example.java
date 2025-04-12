import java.util.Vector;

public class Vector_Example {
    public static void main(String[] args) {
        // Create a Vector of Integers
        Vector<Integer> vec = new Vector<Integer>();
        
        // 1. add(element) - Add elements to vector
        System.out.println("--- Adding elements ---");
        for(int i = 1; i <= 10; i++) {
            vec.add(i);  // Adds elements 1 through 10
        }
        vec.add(5);     // Add duplicate value for demonstration
        System.out.println("Vector contents: " + vec);
        
        // 2. get(index) - Retrieve element by index
        System.out.println("\n--- Accessing elements ---");
        System.out.println("Item at index 5: " + vec.get(5));
        
        // 3. isEmpty() - Check if vector is empty
        System.out.println("Is vector empty? " + vec.isEmpty());
        
        // 4. remove(index) - Remove element by index
        System.out.println("\n--- Removing elements ---");
        System.out.println("Removing element at index 5: " + vec.remove(5));
        System.out.println("Vector after removal: " + vec);
        
        // 5. size() - Get vector size
        System.out.println("Current size: " + vec.size());
        
        // 6. indexOf(element) - Find first occurrence
        System.out.println("\n--- Searching elements ---");
        System.out.println("First index of 5: " + vec.indexOf(5));
        System.out.println("First index of 99: " + vec.indexOf(99)); // Not found
        
        // 7. lastIndexOf(element) - Find last occurrence
        vec.add(5); // Add another 5 for demonstration
        System.out.println("Last index of 5: " + vec.lastIndexOf(5));
        
        // 8. clear() - Clear all elements (same as removeAllElements())
        System.out.println("\n--- Clearing vector ---");
        vec.clear();
        System.out.println("Vector after clear: " + vec);
        System.out.println("Is vector empty now? " + vec.isEmpty());
        
        // 9. removeAllElements() - Alternative clearing method
        vec.add(100);
        vec.add(200);
        System.out.println("\nVector before removeAllElements: " + vec);
        vec.removeAllElements();
        System.out.println("Vector after removeAllElements: " + vec);
    }
}