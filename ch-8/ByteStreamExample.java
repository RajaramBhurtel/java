import java.io.*;

public class ByteStreamExample {
    public static void main(String[] args) {
        try {
            // Writing to a file
            // FileOutputStream fout = new FileOutputStream("output.txt");
            // String data = "Hello, Byte Stream!";
            // fout.write(data.getBytes());
            // fout.close();

            // Reading from a file
            FileInputStream fin = new FileInputStream("html.jpg");
            FileOutputStream fout = new FileOutputStream("output.jpg");

            int i;
            while ((i = fin.read()) != -1) {
                fout.write((byte)i);
            }
            fin.close();
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
