public class PassByValueExample {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before method call, a = " + a);
        modifyValue(a);  // Passing the value of 'a'
        System.out.println("After method call, a = " + a);  // 'a' remains unchanged
    }

    // Method that tries to modify the value of 'a'
    public static void modifyValue(int num) {
        num = 20;  // This change won't affect the original variable 'a'
        System.out.println("Inside modifyValue method, num = " + num);
    }
}
