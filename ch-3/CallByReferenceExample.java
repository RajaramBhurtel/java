import java.util.*;  
public class CallByReferenceExample   
{  
    public static void main(String[] args)   
    {  
        // Create an instance of CallByReference and assign values using the constructor  
        CallByReference object=new CallByReference(10, 20);  
  
        System.out.println("Value of a: "+object.a +" & b: " +object.b);  
  
        // Call the changeValue method and pass the object as an argument  
        object.changeValue(object);  
  
        // Display the values after calling the method  
        System.out.println("Value of a:"+object.a+ " & b: "+object.b);  
    }  
}  
// Callee  
class CallByReference   
{  
    int a,b;  
  
    // Constructor to assign values to the class variables  
    CallByReference(int x,int y)   
    {  
        a=x;  
        b=y;  
    }  
  
    // Method to change the values of class variables  
    void changeValue(CallByReference obj)   
    {  
        obj.a+=10;  
        obj.b+=20;  
    }  
}  
  
// Caller  
