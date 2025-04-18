import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random int
        int randomInt = random.nextInt();  // Any int value
        System.out.println("Random int: " + randomInt);

        // Generate a random int between 0 (inclusive) and 100 (exclusive)
        int randomIntBound = random.nextInt(100);
        System.out.println("Random int (0-99): " + randomIntBound);

        // Generate a random double between 0.0 and 1.0
        double randomDouble = random.nextDouble();
        System.out.println("Random double (0.0 - 1.0): " + randomDouble);

        // Generate a random boolean
        boolean randomBool = random.nextBoolean();
        System.out.println("Random boolean: " + randomBool);
    }
}
