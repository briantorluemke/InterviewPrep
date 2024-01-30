package Codeup.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        // Declare a variable of type Measurable
        Measurable myShape = new Square(5);
        System.out.println("Area: " + myShape.getArea());
        System.out.println("Perimeter: " + myShape.getPerimeter());
        Measurable myShape2 = new Rectangle(5,9);
        System.out.println("Area: " + myShape2.getArea());
        System.out.println("Perimeter: " + myShape2.getPerimeter());
        System.out.println("Length: " + myShape2.getLength());
    }
}