public class NewCat {
    // Static variable
    static int legs = 4;

    // Instance variable
    String name;

    // Constructor
    public NewCat(String name) {
        this.name = name;
    }

    // Static method to change the number of legs
    static void changeLegs(int newLegs) {
        legs = newLegs;
    }

    // Method to display information about the cat
    void displayInfo() {
        System.out.println("Cat: " + name + ", Legs: " + legs);
    }

    public static void main(String[] args) {
        // Create instances of NewCat
        NewCat cat1 = new NewCat("Whiskers");
        NewCat cat2 = new NewCat("Mittens");

        // Display initial information
        cat1.displayInfo(); // Cat: Whiskers, Legs: 4
        cat2.displayInfo(); // Cat: Mittens, Legs: 4

        // Change the number of legs using the static method
        NewCat.changeLegs(3);

        // Display updated information
        cat1.displayInfo(); // Cat: Whiskers, Legs: 3
        cat2.displayInfo(); // Cat: Mittens, Legs: 3
    }
}
