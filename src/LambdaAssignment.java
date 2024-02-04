interface NumberOperation {
    double performOperation(double a, double b);
}

public class LambdaAssignment {
    public static void main(String[] args) {
        NumberOperation addition = (a, b) -> a + b;
        NumberOperation subtraction = (a, b) -> a - b;
        NumberOperation division = (a, b) -> a / b;
        NumberOperation multiplication = (a, b) -> a * b;

        // Perform operations in one line
        double result = division.performOperation(
                multiplication.performOperation(
                        subtraction.performOperation(
                                addition.performOperation(6, 7),
                                3),
                        4),
                2);

        // Print the final result
        System.out.println("Result: " + result);
    }
}
