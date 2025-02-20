public class InherExe {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method
        myDog.bark(); // Dog-specific method
    }
}

// Parent class (superclass)
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class (subclass)
class Dog extends Animal {
    // Inherits eat() method from Animal class

    public void bark() {
        System.out.println("Dog barks");
    }
}

