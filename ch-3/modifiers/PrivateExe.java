public class PrivateExe {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        // obj.privateVar = 10;  // Error: privateVar has private access in MyClass
        // obj.showPrivate();    // Error: showPrivate() has private access in MyClass

        obj.accessPrivate();  // Access via a public method
    }
}

class MyClass {
    private int privateVar;  // Accessible only within this class

    private void showPrivate() {
        System.out.println("This is a private method.");
    }

    // Public method to access private member
    public void accessPrivate() {
        privateVar = 20;
        showPrivate();
    }
}
