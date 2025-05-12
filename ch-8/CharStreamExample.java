import java.io.*;

public class CharStreamExample {
    public static void main(String[] args) {
        try {
            // Writing to a file
            FileWriter writer = new FileWriter("text1.txt");
            writer.write("Hello, Character Stream 2222!");
            writer.close();

            // Reading from a file
            FileReader reader = new FileReader("text1.txt");
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
