import java.util.Arrays;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

public class kLargestEle {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4}; // Predefined array
        int k = 2; // Predefined k value

        Solution sol = new Solution();
        int result = sol.findKthLargest(nums, k);

        System.out.println("The " + k + "th largest element is: " + result);
    }
}

