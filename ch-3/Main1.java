class Polygon {
     double dimensions1;
     double dimensions2;

    public Polygon(double dimensions1, double dimensions2) {
        this.dimensions1 = dimensions1;
        this.dimensions2 = dimensions2;
    }
}

class Rectangle extends Polygon {

    public Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    public double calculateArea() {
        return dimensions1 * dimensions2; 
    }
}

class Triangle extends Polygon {

    public Triangle(double breadth, double height) {
               super(height, breadth);
    }

    public double calculateArea() {
        return 0.5 * dimensions1 * dimensions2; 
    }
}

public class Main1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.5, 5.5);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(10.5, 5.5);
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
