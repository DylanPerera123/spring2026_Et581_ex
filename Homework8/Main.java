public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Phone", 800.0);
        Product p3 = new Product("Mouse", 50.0);
        Product p4 = new Product("Keyboard", 100.0);

        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        cart1.addProduct(p1);
        cart1.addProduct(p3);
        cart2.addProduct(p2);
        cart2.addProduct(p4);

        cart1.showCart();
        cart2.showCart();

        Cart.printTotalCartNumber();

        System.out.println("Original Laptop price: $" + p1.getPrice());
        p1.setPrice(1000.0);
        System.out.println("Updated Laptop price: $" + p1.getPrice());
    }
}