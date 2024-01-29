package Codeup.shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        double area = length * width;
        System.out.printf("Rectangle area = %.2f.%n", area);
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * length + 2 * width;
        System.out.printf("Rectangle perimeter = %.2f.%n", perimeter);
        return perimeter;
    }
}
