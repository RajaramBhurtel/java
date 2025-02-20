public class MyDistance {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 9);
        Distance d2 = new Distance(3, 11);

        // Display initial distances
        System.out.print("Distance 1: ");
        d1.displayDistance();
        System.out.print("Distance 2: ");
        d2.displayDistance();

        // Add distances
        d1.addDistance(d2);
        System.out.print("After Adding: ");
        d1.displayDistance();

        // Subtract distances
        d1.subtractDistance(d2);
        System.out.print("After Subtracting: ");
        d1.displayDistance();
    }
}


class Distance {
    private int feet;
    private int inches;

    // Default constructor
    public Distance() {
        this.feet = 0;
        this.inches = 0;
    }

    // Parameterized constructor
    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
        normalizeDistance();
    }

    // Method to normalize the distance values
    private void normalizeDistance() {
        if (inches >= 12) {
            feet += inches / 12;
            inches = inches % 12;
        }
    }

    // Method to add another Distance object to this Distance object
    public void addDistance(Distance d) {
        this.feet += d.feet;
        this.inches += d.inches;
        normalizeDistance();
    }

    // Method to subtract another Distance object from this Distance object
    public void subtractDistance(Distance d) {
        int totalInches1 = this.feet * 12 + this.inches;
        int totalInches2 = d.feet * 12 + d.inches;
        int totalInchesResult = totalInches1 - totalInches2;

        this.feet = totalInchesResult / 12;
        this.inches = totalInchesResult % 12;
    }

    // Method to display the distance
    public void displayDistance() {
        System.out.printf("Distance: %d feet %d inches\n", feet, inches);
    }
}
