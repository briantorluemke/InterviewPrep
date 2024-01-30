public class StringOperationExample {
    // TODO: Your code for the StringOperation interface and lambda expression goes here
    interface StringOperation {
        String combine(String a, String b);
    }

    public static void main(String[] args) {
        // TODO: Use the lambda expression to concatenate two strings and print the result
        StringOperation combination = (a, b) -> a + b;

        // Example strings
        String str1 = "Hello, ";
        String str2 = "world!";

        // Combining the strings using the lambda expression
        String result = combination.combine(str1, str2);

        // Printing the result
        System.out.println(result);
    }
}
