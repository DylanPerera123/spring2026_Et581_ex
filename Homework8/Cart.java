public class Cart {
    private Product[] products = new Product[5];
    private int count = 0;

    private static int totalCartNumber = 0;

    public Cart() {
        totalCartNumber++;
    }

    public void addProduct(Product p) {
        if (count < products.length) {
            products[count] = p;
            count++;
        } else {
            System.out.println("Cart is full.");
        }
    }

    public double calculateTotal() {
        double total = 0;

        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }

        return total;
    }

    public void showCart() {
        System.out.println("Products in cart:");

        for (int i = 0; i < count; i++) {
            System.out.println(products[i].getName());
        }

        System.out.println("Total: $" + calculateTotal());
        System.out.println();
    }

    public static void printTotalCartNumber() {
        System.out.println("Total number of carts: " + totalCartNumber);
    }
}