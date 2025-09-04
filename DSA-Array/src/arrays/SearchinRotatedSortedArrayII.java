package arrays;
public class SearchinRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int i;
        for (i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchinRotatedSortedArrayII obj = new SearchinRotatedSortedArrayII();
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;

        boolean result = obj.search(nums, target);
        if (result) {
            System.out.println("Target found in the array.");
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
