class Animal {
    // Fields (attributes)
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to represent eating behavior
    void eat() {
        System.out.println("Animal is eating");
    }

    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}