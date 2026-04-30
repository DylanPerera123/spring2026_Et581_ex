public class Main2 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", 10.0);
        EBook b2 = new EBook("Advanced Java", 15.0, 2.5);

        Library lib1 = new Library(b1);
        Library lib2 = new Library(b2);

        lib1.displayBook();
        lib2.displayBook();
    }
}