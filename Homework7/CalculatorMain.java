public class CalculatorMain {
    public static void main(String[] args) {

        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator(5);

        System.out.println("=== calc1 ===");
        System.out.println("Add 10 + 5 = " + calc1.add(10, 5));
        System.out.println("Subtract 10 - 5 = " + calc1.subtract(10, 5));
        System.out.println("Multiply 10 * 5 = " + calc1.multiply(10, 5));
        System.out.println("Divide 10 / 5 = " + calc1.divide(10, 5));
        System.out.println("Add doubles 5.5 + 4.5 = " + calc1.add(5.5, 4.5));
        System.out.println("Counter: " + calc1.counter);

        System.out.println();

        System.out.println("=== calc2 ===");
        System.out.println("Add 20 + 10 = " + calc2.add(20, 10));
        System.out.println("Subtract 20 - 10 = " + calc2.subtract(20, 10));
        System.out.println("Counter: " + calc2.counter);
    }
}