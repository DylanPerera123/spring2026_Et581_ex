package Homework4;

import java.util.Scanner;

public class ReplaceLetter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        String newWord = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') {
                newWord = newWord + "*";
            } else {
                newWord = newWord + word.charAt(i);
            }
        }

        System.out.println("Result: " + newWord);
        input.close();
    }
}