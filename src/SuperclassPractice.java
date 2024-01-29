import java.lang.Math;

public class SuperclassPractice {

    //Superclass
    public class Shape {
        double length;
        double width;

        void calculateArea() {
            try {
                if (length < 0 || width < 0) {
                    throw new NegativeValueException("Length or width is negative.");
                }
                // Code that may throw exception
                double area = length * width;
                // This will not run if an exception occurs
                System.out.println("Area of shape is: " + area);
            } catch (NegativeValueException e) {
                System.out.println("Exception caught: " + e.getMessage());
            } finally {
                // This block will be executed regardless of an exception or not
                System.out.println("Finally block executed");
            }
        }
    }

    public class NegativeValueException extends Exception {

        //Constructor that takes a message
        public NegativeValueException(String message) {
            super(message);
        }
    }

    class Circle extends Shape {
        double radius;

        @Override
        void calculateArea() {
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("Area = " + area);
        }
    }

    class Rectangle extends Shape {

        @Override
        void calculateArea() {
            double area = length*width;
            System.out.println("Area = " + area);
        }
    }
}
