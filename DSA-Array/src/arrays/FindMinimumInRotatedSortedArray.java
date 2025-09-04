package arrays;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray obj = new FindMinimumInRotatedSortedArray();
        int[] nums = {3,4,5,1,2};

        int result = obj.findMin(nums);
        System.out.println("Minimum element in the rotated sorted array is: " + result);
    }
}
