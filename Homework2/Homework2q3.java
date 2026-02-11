
public class Homework2q3 {

    public static boolean isBetweenAppleAndMango(String word) {
        String w = word.toLowerCase();
        return w.compareTo("apple") > 0 && w.compareTo("mango") < 0;
    }

    public static void main(String[] args) {
        System.out.println(isBetweenAppleAndMango("banana"));
        System.out.println(isBetweenAppleAndMango("zebra"));
    }
}


