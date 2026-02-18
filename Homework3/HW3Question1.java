public class HW3Question1 {

    public static void main(String[] args) {
        listNumbersDivisibleBy7();
        System.out.println("Count: " + countNumbersDivisibleBy7());
        System.out.println("Sum: " + sumNumbersDivisibleBy7());
    }

    public static void listNumbersDivisibleBy7() {
        int num = 1;

        do {
            if (num % 7 == 0) {
                System.out.print(num + " ");
            }
            num++;
        } while (num <= 100);

        System.out.println();
    }

    public static int countNumbersDivisibleBy7() {
        int num = 1;
        int count = 0;

        do {
            if (num % 7 == 0) {
                count++;
            }
            num++;
        } while (num <= 100);

        return count;
    }

    public static int sumNumbersDivisibleBy7() {
        int num = 1;
        int sum = 0;

        do {
            if (num % 7 == 0) {
                sum += num;
            }
            num++;
        } while (num <= 100);

        return sum;
    }
}
