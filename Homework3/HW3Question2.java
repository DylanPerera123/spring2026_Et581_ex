import java.util.Scanner;
import java.util.StringTokenizer;

public class HW3Question2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        printUpperCaseWords(sentence);
        System.out.println("Longest word: " + getLongestWord(sentence));
        System.out.println("Total words: " + countWords(sentence));

        input.close();
    }

    public static void printUpperCaseWords(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence);

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            System.out.println(word.toUpperCase());
        }
    }

    public static String getLongestWord(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        String longest = "";

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest.toUpperCase();
    }

    public static int countWords(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        int count = 0;

        while (tokenizer.hasMoreTokens()) {
            tokenizer.nextToken();
            count++;
        }

        return count;
    }
}
