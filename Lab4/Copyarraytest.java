package Lab4;

public class Copyarraytest {

    public static void shallowCopy() {
        int[] a = {1, 2, 3};
        int[] b = a;

        System.out.println("a value is: " + a);
        System.out.println("b value is: " + b);

        a[2] = 99;

        System.out.println("a[2] : " + a[2]);
        System.out.println("b[2] : " + b[2]);
    }

    public static void deepCopy() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3}; // new int[3] for 1,2,3

        System.out.println("a value is: " + a);
        System.out.println("b value is: " + b);

        a[2] = 99;

        System.out.println("a[2] : " + a[2]);
        System.out.println("b[2] : " + b[2]);
    }

    public static void main(String[] args) {
        shallowCopy();
        deepCopy();
    }
}
