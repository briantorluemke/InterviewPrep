package Codeup.util;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);
    private boolean trueFalse;

    public String getString() {
        System.out.println("Please enter a String:");
        String input = sc.nextLine();
        System.out.printf("Your string: %s.%n",input);
        return input;
    }

    public boolean yesNo() {
        System.out.println("Yes or no:");
        String input = sc.next();
        sc.nextLine();
        trueFalse = input.equalsIgnoreCase("Yes");
        System.out.println(trueFalse);
        return trueFalse;
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d:%n", min, max);
        int input = sc.nextInt();
        if (input < min || input > max) {
            System.out.println("Try again.");
            getInt(min, max);
        } else {
            System.out.println("Good job!");
        }
        return input;
    }

    public int getInt() {
        System.out.println("Please type a number:");
        int input = sc.nextInt();
        System.out.printf("Your number: %d%n", input);
        return input;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Please enter a double between %f and %f:%n", min, max);
        double input = sc.nextDouble();
        if (input < min || input > max) {
            System.out.println("Try again.");
            getDouble(min, max);
        } else {
            System.out.println("Good job!");
        } return input;
    }

    public double getDouble() {
        System.out.println("Enter a double:");
        double input = sc.nextDouble();
        System.out.printf("Your double: %f.%n", input);
        return input;
    }
}
