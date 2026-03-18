public class PhoneMain {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone("Apple");
        Phone p3 = new Phone("Samsung", "Galaxy S23");
        Phone p4 = new Phone("Google", "Pixel 8", 899.99);

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();

        System.out.println("Is p4 expensive? " + p4.isExpensive());

        p4.applyDiscount(10);
        p4.printInfo();

        p4.updatePrice(750);
        p4.printInfo();
    }
}

