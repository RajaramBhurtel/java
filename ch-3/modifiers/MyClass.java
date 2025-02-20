
public class MyClass {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.defaultVar = 10; // Works because it's within the same package
        obj.showDefault();   // Works because it's within the same package
    }
}
// Default access modifier (no keyword)
class Test {
    int defaultVar;  // Accessible only within the same package

    void showDefault() {
        System.out.println("This is a default access modifier example.");
    }
}

