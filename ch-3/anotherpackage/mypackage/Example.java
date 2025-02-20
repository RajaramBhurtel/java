// File: Example.java
package mypackage;

// Public class accessible from anywhere
public class Example {
    // Public variable accessible from anywhere
    public int publicVar = 10;

    // Protected variable accessible within its own package and by subclasses
    protected int protectedVar = 20;

    // Default (package-private) variable accessible within its own package
    int defaultVar = 30;

    // Private variable accessible only within its own class
    private int privateVar = 40;

    // Public method accessible from anywhere
    public void publicMethod() {
        System.out.println("Public method");
    }

    // Protected method accessible within its own package and by subclasses
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Default (package-private) method accessible within its own package
    void defaultMethod() {
        System.out.println("Default method");
    }

    // Private method accessible only within its own class
    private void privateMethod() {
        System.out.println("Private method");
    }

    // Main method to demonstrate access levels
    public static void main(String[] args) {
        Example obj = new Example();

        // Accessing variables
        System.out.println(obj.publicVar);     // OK
        System.out.println(obj.protectedVar);  // OK
        System.out.println(obj.defaultVar);    // OK
        System.out.println(obj.privateVar);    // Compilation error (privateVar has private access in Example)

        // Accessing methods
        obj.publicMethod();     // OK
        obj.protectedMethod();  // OK
        obj.defaultMethod();    // OK
        obj.privateMethod();    // Compilation error (privateMethod() has private access in Example)
    }
}
