public class Book {
    String title;
    double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Title: " + title + ", Price: " + price);
    }
}