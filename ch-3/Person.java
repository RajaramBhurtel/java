public class Person {
	String name;
    
    Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p = new Person("Alice");
        System.out.println("Before method call, name = " + p.name);
        modifyPerson(p);  // Passing the reference of the Person object
        System.out.println("After method call, name = " + p.name);  // 'name' is changed
    }

    // Method that modifies the 'name' property of the object
    public static void modifyPerson(Person person) {
        person.name = "Bob";  // Modifies the original object's name
        System.out.println("Inside modifyPerson method, name = " + person.name);
    }
}
