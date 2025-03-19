import java.util.Arrays;

class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0, k = nums.length - 1; i < nums.length; i++) {
            if(nums[i] % 2 != 0) ans[k--] = 1;
        }

        return ans;
    }
}

public class TransformArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 7, 10, 15}; // Predefined input

        Solution sol = new Solution();
        int[] result = sol.transformArray(nums);

        System.out.println("Transformed Array: " + Arrays.toString(result));
    }
}
