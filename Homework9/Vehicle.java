public class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle created: " + brand + ", " + year);
    }

    public void start() {
        System.out.println("Vehicle starts");
    }
}