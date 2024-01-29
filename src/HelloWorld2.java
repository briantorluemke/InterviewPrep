public class HelloWorld2 {
    // Static variable
    static int instanceCount = 0;

    // Static method
    static void sayHello() {
        System.out.println("Hello from a static method!");
    }

    public static void main(String[] args) {
        // Increment the static variable
        instanceCount++;
        System.out.println("Number of instances: " + instanceCount);

        // Call the static method
        sayHello();
    }
}
