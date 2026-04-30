public class Car extends Vehicle {
    int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
        System.out.println("Car created: " + brand + ", doors: " + doors);
    }

    @Override
    public void start() {
        System.out.println("Car starts");
    }
}