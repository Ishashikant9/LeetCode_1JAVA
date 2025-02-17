public class SingleNum {
    public static void main(String[] args) {
        // Predefined array
        int[] nums = {4, 1, 2, 1, 2};

        // Creating an instance of Solution class and calling singleNumber method
        Solution sol = new Solution();
        int singleNum = sol.singleNumber(nums);

        // Displaying the result
        System.out.println("Single Number is: " + singleNum);
    }
}

// Given Solution class
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }
}
