import java.io.*;
import java.net.*;

public class ProcessLogFilesSingleThread {
    public static void main(String[] args) {
        try(FileInputStream fin=new FileInputStream("D:/Study materials/notes/bca/6th sem/Sixth sem/NP/NP lab/access.log");
            Reader in  = new InputStreamReader(fin);
            BufferedReader  bin = new BufferedReader(in);){
            
            for (String entry =bin.readLine();
                 entry != null;
                 entry=bin.readLine()){
                int index =entry.indexOf(' ');
                String ip= entry.substring(0, index);
                String theRest = entry.substring(index);
                
                 try {              
                     InetAddress address =InetAddress.getByName(ip);
                     System.out.println(address.getHostName()+theRest);
                 }catch (UnknownHostException e) {
                     
                     System.err.println(entry);
                 }
            } 
        }
        catch(IOException e){
            System.out.println("Exception:" +e);
        }
    }
    
}