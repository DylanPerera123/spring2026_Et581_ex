public class Driver {
    String name;
    Vehicle vehicle;

    public Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void drive() {
        vehicle.start();
        System.out.println("Driver " + name + " is driving " + vehicle.brand);
    }
}