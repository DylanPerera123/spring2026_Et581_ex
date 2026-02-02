import java.util.Scanner;

public class HW1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score 1: ");
        int score1 = input.nextInt();

        System.out.print("Enter score 2: ");
        int score2 = input.nextInt();

        System.out.print("Enter score 3: ");
        int score3 = input.nextInt();

        double average = (score1 + score2 + score3) / 3.0;

        System.out.println("Average score: " + average);

        input.close();
    }
}
