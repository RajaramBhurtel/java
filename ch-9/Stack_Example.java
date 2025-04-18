import java.util.Stack;

public class Stack_Example {
    public static void main(String[] args) {
        // Create a Stack of Integers
        Stack<Integer> st = new Stack<Integer>();
        
        // 1. push(element) - Add elements to stack
        System.out.println("--- Pushing elements ---");
        for(int i = 1; i <= 10; i++) {
            st.push(i);  // Push elements 1 through 10
        }
        st.push(5);     // Push duplicate value for demonstration
        System.out.println("Stack after pushes: " + st);
        
        // 2. peek() - View top element without removal
        System.out.println("\n--- Peeking at stack ---");
        System.out.println("Top element (peek): " + st.peek());
        
        // 3. pop() - Remove and return top element
        System.out.println("\n--- Popping elements ---");
        System.out.println("Popped element: " + st.pop());
        System.out.println("Popped element: " + st.pop());
        System.out.println("Stack after pops: " + st);
        
        // 4. search(element) - Find element position (1-based from top)
        System.out.println("\n--- Searching stack ---");
        System.out.println("Position of 5 (from top): " + st.search(1));
        System.out.println("Position of 99 (not in stack): " + st.search(99));
        
        // 5. empty() - Check if stack is empty
        System.out.println("\n--- Checking stack status ---");
        if(st.empty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
            System.out.println("Current top element: " + st.peek());
            System.out.println("Stack size: " + st.size());
        }
        
        // Demonstrate EmptyStackException
        System.out.println("\n--- Empty stack demonstration ---");
        Stack<Integer> emptyStack = new Stack<Integer>();
        try {
            System.out.println("Attempting to pop from empty stack...");
            emptyStack.pop();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
        }
    }
}