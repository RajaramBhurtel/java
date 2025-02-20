// Define the Car class (blueprint)
 class Car {
    // Properties of the car
    String color;
    String model;
    int year;

    // Constructor to initialize the car with color, model, and year
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;

        this.drive();
        this.honk();
        this.stop();
    }

    // Method to make the car drive
    public void drive() {
        System.out.println("The " + color + " " + model + " is driving.");
    }

    // Method to make the car honk
    public void honk() {
        System.out.println("Beep beep!");
    }

    // Method to make the car stop
    public void stop() {
        System.out.println("The " + color + " " + model + " has stopped.");
    }
}

// Create a Playground class to demonstrate the concepts
public class Development {
    public static void main(String[] args) {
        // Create a new car object using the Car class and the constructor
        Car myCar = new Car("red", "Toyota", 2022);

        // Call methods on the car object to make it drive, honk, and stop
        // myCar.drive();
        // myCar.honk();
        // myCar.stop();
    }
}
