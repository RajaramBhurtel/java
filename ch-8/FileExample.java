import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("test1.txt");
        
        // Check if file exists
        if (file.exists()) {
            System.out.println("File exists!");
        } else {
            System.out.println("File does not exist.");
        }
        File file1 = new File("test2.txt");

        // Create a new file
        try {
            boolean created = file1.createNewFile();
            System.out.println("File created: " + created);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}