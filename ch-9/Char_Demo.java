// Character class demonstration program
public class Char_Demo {
    public static void main(String[] args) {
        // isLetter() demonstration
        System.out.println("isLetter() demonstrations:");
        System.out.println(Character.isLetter('A'));  // true
        System.out.println(Character.isLetter('0'));  // false
        System.out.println();

        // isDigit() demonstration
        System.out.println("isDigit() demonstrations:");
        System.out.println(Character.isDigit('A'));   // false
        System.out.println(Character.isDigit('0'));   // true
        System.out.println();

        // isWhitespace() demonstration
        System.out.println("isWhitespace() demonstrations:");
        System.out.println(Character.isWhitespace('A'));  // false
        System.out.println(Character.isWhitespace(' '));  // true
        System.out.println(Character.isWhitespace('\n')); // true
        System.out.println(Character.isWhitespace('\t')); // true
        System.out.println(Character.isWhitespace(9));    // true (ASCII 9 = tab)
        System.out.println(Character.isWhitespace('9'));  // false
        System.out.println();

        // toLowerCase() demonstration
        System.out.println("toLowerCase() demonstrations:");
        System.out.println(Character.toLowerCase('A'));  // 'a'
        System.out.println(Character.toLowerCase(65));   // 97 (ASCII 'a')
        System.out.println(Character.toLowerCase(48));   // 48 (digit '0' doesn't change)
        System.out.println();

        // Additional requested methods
        System.out.println("Additional character methods:");
        
        // isUpperCase() demonstration
        System.out.println("isUpperCase() demonstrations:");
        System.out.println(Character.isUpperCase('A'));  // true
        System.out.println(Character.isUpperCase('a'));  // false
        System.out.println(Character.isUpperCase('5'));  // false
        System.out.println();

        // isLowerCase() demonstration
        System.out.println("isLowerCase() demonstrations:");
        System.out.println(Character.isLowerCase('A'));  // false
        System.out.println(Character.isLowerCase('a'));  // true
        System.out.println(Character.isLowerCase('5'));  // false
        System.out.println();

        // toUpperCase() demonstration
        System.out.println("toUpperCase() demonstrations:");
        System.out.println(Character.toUpperCase('a'));  // 'A'
        System.out.println(Character.toUpperCase(97));   // 65 (ASCII 'A')
        System.out.println(Character.toUpperCase(48));  // 48 (digit '0' doesn't change)
    }
}