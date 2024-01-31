// Assignment:
// 1. Open IntelliJ IDEA and create a new Java class called DiamondProblemExample.
// 2. Copy the provided Java code for the Diamond Problem example into your new class.
// 3. Uncomment the lines in MyClass to provide a custom implementation for defaultMethod.
// 4. Try to compile and run the program to observe the resolution of the Diamond Problem.

// Note: Make sure to understand how uncommenting the lines in MyClass resolves the ambiguity.
// Observe the behavior when you comment and uncomment those lines.

// Your code goes here:

public class DiamondProblemExample {
    interface InterfaceA {
        default void defaultMethod() {
            System.out.println("Default method for interface A");
        };
    }

    interface InterfaceB {
        default void defaultMethod() {
            System.out.println("Default method for interface B");
        }
    }
    static class MyClass implements InterfaceA, InterfaceB {
        public void defaultMethod() {
            System.out.println("Default method for MyClass.");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass myObject = new MyClass();

        // Uncommenting the line below will result in a compilation error due to the ambiguity
        myObject.defaultMethod();
    }
}
