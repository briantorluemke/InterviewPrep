public class GPTExercises {
    public static void main(String[] args) {
            // Provide the necessary data
            String name = "John";
            int age = 25;
            double height = 1.75;

            // Your code for formatting and printing the information goes here
            System.out.printf("Name: %s\nAge: %d\nHeight: %.2f meters\n", name, age, height);




        // Provide the necessary data
        double pi = Math.PI;
        double sqrt2 = Math.sqrt(2);
        int number = 42;

        // Your code for formatting and printing the numeric values goes here
        System.out.printf("Pi: %.3f\nSquare Root: %.5f\nNumber: %5d", pi, sqrt2, number);

        String myName = "Douglas";
        int myAge = 27;
        double myHeight = 6.4;

        System.out.printf("My Name: %s\nMy Age: %d\nMy Height: %.1f", myName, myAge, myHeight);

        // Review Below for Static
        // Instance:
        StaticExample s1 = new StaticExample();
        s1.helloAgain();


        StaticExample.sayHello();


    }
}
