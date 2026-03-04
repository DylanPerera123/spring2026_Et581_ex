import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < n; i++) {
            sum += numbers[i];

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);

        input.close();
    }
}