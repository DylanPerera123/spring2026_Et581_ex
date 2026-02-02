import java.util.Scanner;

public class HW1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 4-digit integer: ");
        int num = input.nextInt();

        int first = num / 1000;
        int second = (num / 100) % 10;
        int third = (num / 10) % 10;
        int fourth = num % 10;

        System.out.println("first digit: " + first);
        System.out.println("second digit: " + second);
        System.out.println("third digit: " + third);
        System.out.println("fourth digit: " + fourth);

        input.close();
    }
}
