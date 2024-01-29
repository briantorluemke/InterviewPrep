public class Book {
    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Published in: " + year);
    }

    public static void main(String[] args) {
        Book myBook = new Book("Where The Wild Things Are", "Maurice Sendak", 1963);
        myBook.displayInfo();
    }
}
