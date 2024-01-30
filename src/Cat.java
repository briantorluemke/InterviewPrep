public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    void eat() {
        super.eat();
    }

    @Override
    void makeSound() {
        System.out.println("Cat makes a sound.");
    }

    public static void main(String[] args) {
        Animal cat = new Cat("Larry", 5);
        cat.eat();
        cat.makeSound();
    }
}
