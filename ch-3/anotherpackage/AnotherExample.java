// File: AnotherExample.java

import mypackage.Example;

public class AnotherExample  {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        // obj.main();
        // Accessing inherited variables
        System.out.println(obj.publicVar);     // OK
        System.out.println(obj.protectedVar);  // OK
        System.out.println(obj.defaultVar);  
        System.out.println(obj.privateVar);  

        // Accessing inherited methods
        // obj.publicMethod();     // OK
        // obj.protectedMethod();  // OK

        // MyClass cls = new MyClass();
        // cls.main();
        
    }
}

class  MyClass extends Example{
    public void main(){
        // System.out.println(privateVar);
        // privateMethod();

        // System.out.println(publicVar);
        // publicMethod();
    }
}
