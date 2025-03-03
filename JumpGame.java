public class JumpGame {
    public static void main(String[] args) {
        // Predefined integer array
        int[] nums = {2, 3, 1, 1, 4};

        // Creating an instance of Solution class and calling canJump method
        Solution sol = new Solution();
        boolean result = sol.canJump(nums);

        // Displaying the result
        System.out.println("Can jump to the last index? " + result);
    }
}

// Given Solution class
class Solution {
    public boolean canJump(int[] nums) {
        int last = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= last) {
                last = i;
            }
        }
        return last == 0;
    }
}

