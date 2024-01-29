package Codeup.shapes;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = side * side;
        System.out.printf("Square area = %.2f.%n", area);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 4 * side;
        System.out.printf("Square perimeter = %.2f.%n", perimeter);
        return perimeter;
    }
}
