public class Wrap_Unwrap {
    public static void main(String[] args) {
        //wrapping int to Integer
        int a = 10;
        // Integer obj1 = new Integer(a);
        Integer obj1 = new Integer(a);
        
        //wrapping double to Double
        double d = 10.5;
        Double objd = new Double(d);
        
        //wrapping char to Character
        char c = 'x';
        Character objc = new Character(c);

        System.out.println("After Wrapping..."); 
        System.out.println("Integer = " + obj1); 
        System.out.println("Double = " + objd); 
        System.out.println("Character = " + objc);

        //unwrapping Integer to int
        int a1 = obj1; 
        //unwrapping Double to double
        double d1 = objd; 
        //unwrapping Character to char
        char c1 = objc;

        System.out.println("After Unwrapping..."); 
        System.out.println("int = " + a1); 
        System.out.println("double = " + d1); 
        System.out.println("char = " + c1);
    }
}

// Note: In modern Java (since Java 9), using constructors like new Integer() is deprecated. 
// The preferred way is to use Integer.valueOf() or simply rely on autoboxing (e.g., Integer obj1 = a;). 
// However, I've kept the original code style as shown in the image.