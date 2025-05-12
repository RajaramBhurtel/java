import java.io.*;
public class SerializationExample {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "John");
            
            // Serialization
            FileOutputStream fout = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.close();
            System.out.println("Object serialized.");
            
            // Deserialization
            FileInputStream fin = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fin);
            Student s2 = (Student) in.readObject();
            System.out.println("Deserialized Student: " + s2.id + " " + s2.name);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Student implements Serializable {
    int id;
    String name;
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}