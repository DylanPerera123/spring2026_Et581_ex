package Homework4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int largest = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (i == 1) {
                largest = num;
            }

            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest number is: " + largest);
        input.close();
    }
}