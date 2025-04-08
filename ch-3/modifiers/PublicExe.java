public class PublicExe {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.publicVar = 30;  // Accessible because it's public
        obj.showPublic();    // Accessible because it's public
    }
}
class MyClass {
    protected int publicVar;  // Accessible from any class

    protected void showPublic() {
        System.out.println("This is a public method.");
    }
}
