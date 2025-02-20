public class PublicExe {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.publicVar = 30;  // Accessible because it's public
        obj.showPublic();    // Accessible because it's public
    }
}
class MyClass {
    public int publicVar;  // Accessible from any class

    public void showPublic() {
        System.out.println("This is a public method.");
    }
}
