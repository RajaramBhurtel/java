public class AbsExe {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // Abstraction: we don't need to know how it starts internally
        myCar.stop();
    }
}
// Abstract class
abstract class Vehicle {
    // Abstract method (does not have a body)
    public abstract void start();

    // Regular method
    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Concrete class
class Car extends Vehicle {
    // Providing implementation for abstract method
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}
