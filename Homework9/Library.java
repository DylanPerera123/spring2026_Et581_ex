public class Library {
    Book book;

    public Library(Book book) {
        this.book = book;
    }

    public void displayBook() {
        book.showInfo();
    }
}