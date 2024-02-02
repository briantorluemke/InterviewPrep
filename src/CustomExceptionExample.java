public class CustomExceptionExample {
    static class InvalidInputException extends Exception {
        InvalidInputException(String message) {
            super(message);
        }
    }

    static int validateInput(int a) throws InvalidInputException {
        if (a <= 0) {
            throw new InvalidInputException("Less than zero!");
        } else {
            System.out.println("Valid! Your number is " + a);
            return a;
        }
    }

    public static void main(String[] args) {
        try {
            validateInput(5);
        } catch (InvalidInputException e) {
            System.out.println("Zero caught: " + e);
        }
    }
}
