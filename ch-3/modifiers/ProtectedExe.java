public class ProtectedExe {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.showSpecies();  // Accessible through subclass method
    }
}
class Animal {
    protected String species = "Unknown species";  // Accessible in subclasses and within the same package
}

class Dog extends Animal {
    void showSpecies() {
        System.out.println("Species: " + species);  // Accessing protected member
    }
}

