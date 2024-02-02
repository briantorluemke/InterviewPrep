public class ExceptionHandlingAssignment {

    static class CustomException extends Exception {
        // Constructor for your custom exception (you can add more details if needed)
        CustomException(String message) {
            super(message);
        }
    }

    static int performDivision(int a, int b) throws CustomException {
        if (b == 0) {
            throw new CustomException("Denominator cannot be zero!");
        }
        int result = a / b;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        try {
            performDivision(10, 0);
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("This is always going to run.");
        }
    }
}
