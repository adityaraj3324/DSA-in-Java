package arrays;

public class FindMinimumInRotatedSortedArrayII {
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
        FindMinimumInRotatedSortedArrayII obj = new FindMinimumInRotatedSortedArrayII();
        int[] nums = {2,2,2,0,1};

        int result = obj.findMin(nums);
        System.out.println("Minimum element in the rotated sorted array with duplicates is: " + result);
    }
}

