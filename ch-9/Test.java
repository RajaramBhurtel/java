public class Test {
    public static void main(String[] args) {
        // Creating a Double Class object with value "6.9685"
        Double d = new Double("6.9685");
        
        // Converting this Double(Number) object to
        // different primitive data types
        byte b = d.byteValue();
        short s = d.shortValue();
        int i = d.intValue();
        long l = d.longValue();
        float f = d.floatValue();
        double di = d.doubleValue();

        System.out.println("Value of d after converting it to byte : " + b);
        System.out.println("Value of d after converting it to short : " + s);
        System.out.println("Value of d after converting it to int : " + i);
        System.out.println("Value of d after converting it to long : " + l);
        System.out.println("Value of d after converting it to float : " + f);
        System.out.println("Value of d after converting it to double : " + di);
    }
}