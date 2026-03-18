public class Phone {
    String brand;
    String model;
    double price;

    public Phone() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0.0;
    }

    public Phone(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.price = 0.0;
    }

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 0.0;
    }

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public boolean isExpensive() {
        return price > 800;
    }

    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
    }
}