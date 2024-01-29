package Codeup;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Person doug = new Person("Doug");
        doug.setName("Brian");
        doug.sayHello();

        // Exercises
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person3 = new Person("John");
//        Person person4 = person3;
//        System.out.println(person3 == person4);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); // John
        System.out.println(person2.getName()); // John
        person2.setName("Jane");
        System.out.println(person1.getName()); // Jane (remember, person2 IS person1)
        System.out.println(person2.getName()); // Jane
    }
}
