public class EBook extends Book {
    double fileSize;

    public EBook(String title, double price, double fileSize) {
        super(title, price);
        this.fileSize = fileSize;
    }

    @Override
    public void showInfo() {
        System.out.println("EBook: " + title + ", Price: " + price + ", Size: " + fileSize + "MB");
    }
}