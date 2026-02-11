public class Homework2q1 {

    public static String substringFromApple(String text) {
        String lower = text.toLowerCase();
        int index = lower.indexOf("apple");
        return text.substring(index);
    }

    public static void main(String[] args) {
        System.out.println(substringFromApple("I like Apple pie"));
    }
}


