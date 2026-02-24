package Homework4;

import java.util.Scanner;

public class CountPositive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter number: ");
            int num = input.nextInt();

            if (num > 0) {
                count = count + 1;
            }
        }

        System.out.println("Positive numbers: " + count);
        input.close();
    }
}