
import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {

        int[] nums = {3, 8, 5, 12, 7, 4};

        int evenCount = 0;
        int oddCount = 0;

        // count evens and odds
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];

        int e = 0;
        int o = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenArray[e] = nums[i];
                e++;
            } else {
                oddArray[o] = nums[i];
                o++;
            }
        }

        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Even number count: " + evenCount);
        System.out.println("Odd number count: " + oddCount);
        System.out.println("Even numbers: " + Arrays.toString(evenArray));
        System.out.println("Odd numbers: " + Arrays.toString(oddArray));
    }
}