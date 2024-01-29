package Codeup.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        // Create a Rectangle
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("Rectangle:");
        System.out.println("Perimeter: " + box1.getPerimeter());
        System.out.println("Area: " + box1.getArea());

        // Create a Rectangle and assign it a Square
        Rectangle box2 = new Square(5);
        System.out.println("Square (as Rectangle):");
        System.out.println("Perimeter: " + box2.getPerimeter());
        System.out.println("Area: " + box2.getArea());
    }
}