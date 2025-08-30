package arrays;
import java.util.*;

public class FirstAndLast {
     
    public static int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;

        // find first occurrence
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                first = i;
                break;
            }
        }

        // find last occurrence
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                last = j;
                break;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of array (sorted): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

        sc.close();
    }
}
