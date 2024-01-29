public class User {
    // User properties
    String name;

    // Constructor
    public User(String name) {
        this.name = name;

        // Increment the total count using Counter class
        Counter.incrementCount();
    }
}
