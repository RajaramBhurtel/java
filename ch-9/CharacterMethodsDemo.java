public class CharacterMethodsDemo {
    public static void main(String[] args) {
        // 1. Case Conversion
        System.out.println("--- Case Conversion ---");
        System.out.println("'A' to lowercase: " + Character.toLowerCase('A')); // 'a'
        System.out.println("'z' to uppercase: " + Character.toUpperCase('z')); // 'Z'
        System.out.println("'1' case unchanged: " + Character.toLowerCase('1')); // '1'

        // 2. Letter Check
        System.out.println("\n--- Letter Check ---");
        System.out.println("Is 'B' a letter? " + Character.isLetter('B')); // true
        System.out.println("Is '$' a letter? " + Character.isLetter('$')); // false

        // 3. Digit Check
        System.out.println("\n--- Digit Check ---");
        System.out.println("Is '5' a digit? " + Character.isDigit('5')); // true
        System.out.println("Is 'X' a digit? " + Character.isDigit('X')); // false

        // 4. Whitespace Check
        System.out.println("\n--- Whitespace Check ---");
        System.out.println("Is space whitespace? " + Character.isWhitespace(' ')); // true
        System.out.println("Is tab whitespace? " + Character.isWhitespace('\t')); // true
        System.out.println("Is 'A' whitespace? " + Character.isWhitespace('A')); // false

        // 5. Case Check
        System.out.println("\n--- Case Check ---");
        System.out.println("Is 'D' uppercase? " + Character.isUpperCase('D')); // true
        System.out.println("Is 'd' lowercase? " + Character.isLowerCase('d')); // true
        System.out.println("Is '3' lowercase? " + Character.isLowerCase('3')); // false

        // Practical Password Validation
        System.out.println("\n--- Password Check ---");
        String password = "Secret123";
        boolean hasUpper = false, hasLower = false, hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isDigit(c)) hasDigit = true;
        }

        System.out.println("Has uppercase: " + hasUpper); // true
        System.out.println("Has lowercase: " + hasLower); // true
        System.out.println("Has digit: " + hasDigit);     // true
    }
}