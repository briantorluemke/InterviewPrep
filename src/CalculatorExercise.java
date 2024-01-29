import java.util.Scanner;

public class CalculatorExercise {
    static int Addition(int x, int y) {
        int result = x+y;
        System.out.println(result);
        return result;
    }

    static double Addition(double x, double y) {
        double result = x+y;
        System.out.println(result);
        return result;
    }

    static int Subtraction(int x, int y) {
        int result = x - y;
        System.out.println(result);
        return result;
    }

    static double Subtraction(double x, double y) {
        double result = x-y;
        System.out.println(result);
        return result;
    }

    static int Multiply(int x, int y) {
        int result = x*y;
        System.out.println(result);
        return result;
    }

    static double Multiply(double x, double y) {
        double result = x*y;
        System.out.println(result);
        return result;
    }

    static int Divide(int x, int y) {
        int result = x/y;
        System.out.println(result);
        return result;
    }

    static double Divide(double x, double y) {
        double result = x+y;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type A for addition, S for subtraction, M for multiply, and D for divide: ");
        String input = sc.nextLine();

        // Use nextDouble() or nextInt() based on user input
        System.out.println("Please enter a number: ");
        double firstNumber = sc.hasNextDouble() ? sc.nextDouble() : sc.nextInt();

        System.out.println("Please enter another number: ");
        double secondNumber = sc.hasNextDouble() ? sc.nextDouble() : sc.nextInt();

        if (input.equals("A")) {
            Addition(firstNumber, secondNumber);
        }
        if (input.equals("S")) {
            Subtraction(firstNumber, secondNumber);
        }
        if (input.equals("M")) {
            Multiply(firstNumber, secondNumber);
        }
        if (input.equals("D")) {
            Divide(firstNumber, secondNumber);
        }
    }

}
