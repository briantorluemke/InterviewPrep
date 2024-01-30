public class Lion extends Animal{
    public Lion(String name, int age) {
        super(name, age);
    }

    void eat() {
        System.out.println("Lion is eating.");
    }

    public static void main(String[] args) {
        Animal lion = new Lion("Bruce", 12);
        lion.eat();
    }
}
