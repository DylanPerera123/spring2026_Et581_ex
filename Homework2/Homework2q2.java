public class Homework2q2 {
   

    public static int secondOccurrenceOfOne(String text) {
        int firstIndex = text.indexOf("one");
        int secondIndex = text.indexOf("one", firstIndex + 1);
        return secondIndex;
    }

    public static void main(String[] args) {
        System.out.println(secondOccurrenceOfOne("one two one two one"));
    }
}


