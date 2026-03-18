public class Calculator {
    int counter;

    public Calculator() {
        counter = 0;
    }

    public Calculator(int counter) {
        this.counter = counter;
    }

    public int add(int a, int b) {
        counter++;
        return a + b;
    }

    public int subtract(int a, int b) {
        counter++;
        return a - b;
    }

    public int multiply(int a, int b) {
        counter++;
        return a * b;
    }

    public int divide(int a, int b) {
        counter++;
        return a / b;
    }

    public double add(double a, double b) {
        counter++;
        return a + b;
    }
}
