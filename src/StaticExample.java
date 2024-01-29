public class StaticExample {
    // Static variable
    static int totalCount = 0;

    // Instance variable
    int instanceCount = 0;

    // Static method
    static void incrementCount() {
        totalCount++;
    }


    // belongs to class:
    static void sayHello() {
        System.out.println("Hello");
    }

    // belongs to an instance of the class:
    void helloAgain() {
        System.out.println("Hello again");
    }

    // Non-static method
    void incrementInstanceCount() {
        instanceCount++;
    }

    public static void main(String[] args) {
        // Demonstrate static and non-static behavior

        // Accessing static variable and method using class name
        System.out.println("Initial Count: " + StaticExample.totalCount);
        StaticExample.incrementCount();
        System.out.println("Updated Count: " + StaticExample.totalCount);

        // Creating instances of the class
        StaticExample e1 = new StaticExample();
        StaticExample e2 = new StaticExample();

        e1.incrementInstanceCount();
        e1.incrementInstanceCount();
        e2.incrementInstanceCount();

        System.out.println("1: " + e1.instanceCount);
        System.out.println("2: " + e2.instanceCount);
    }
}
