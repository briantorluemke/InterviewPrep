package Codeup.shapes;

public class Circle {
    private double radius;

    public Circle(double circleRadius) {
        radius = circleRadius;
    }

    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    public double getCircumference() {
        return Math.PI * radius * 2;
    }
}
