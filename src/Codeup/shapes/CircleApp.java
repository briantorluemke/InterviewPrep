package Codeup.shapes;

import Codeup.util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        boolean val = true;
        System.out.println("Before loop: " + val);

        while (val) {
            System.out.println("Inside loop (before input): " + val);
            double radius = input.getDouble();
            Circle circle = new Circle(radius);
            double area = circle.getArea();
            System.out.printf("Your circle has an area of: %f.%n", area);
            double circumference = circle.getCircumference();
            System.out.printf("Your circle has a circumference of: %f.%n", circumference);
            System.out.println("Would you like to make another circle?");
            val = input.yesNo();
            System.out.println("Inside loop (after input): " + val);

        }
        System.out.println("After loop: " + val);
    }

}
