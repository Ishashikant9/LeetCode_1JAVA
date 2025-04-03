import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length; // Base case: return if length <= 2

        int k = 2; // Pointer for inserting next valid element

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) { // Ensure max 2 occurrences
                nums[k] = nums[i];
                k++;
            }
        }

        return k; // Return the new length
    }
}

public class RemoveDuplicatesMain {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println("Original Array: " + Arrays.toString(nums));

        int newLength = sol.removeDuplicates(nums);

        System.out.println("New Length: " + newLength);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
