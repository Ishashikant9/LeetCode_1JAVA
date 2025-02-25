public class FindCloseZero {
    public static void main(String[] args) {
        // Predefined array
        int[] nums = {-4, -2, 1, 4, 8};

        // Creating an instance of Solution class and calling findClosestNumber method
        Solution sol = new Solution();
        int result = sol.findClosestNumber(nums);

        // Displaying the result
        System.out.println("The number closest to zero is: " + result);
    }
}

// Given Solution class
class Solution {
    public int findClosestNumber(int[] nums) {
        int res = Integer.MAX_VALUE;
        for (int i : nums) {
            if (Math.abs(i) < Math.abs(res) || i == Math.abs(res)) {
                res = i;
            }
        }
        return res;
    }
}
