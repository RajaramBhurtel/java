import java.io.*;

public class Throws1{
    static void test() throws IOException{ //It might throw an IOException
        System.out.println("This is IOException");
    }

    static void transfer() throws IOException {
        test();
    }

    public static void main(String args[]) {
        try{
            transfer(); 
        }catch(IOException ex){
            
        }
    }
}