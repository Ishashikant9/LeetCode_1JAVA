public class SumGoodNumber {
    public static void main(String[] args) {
        // Predefined array and k value
        int[] nums = {4, 7, 2, 9, 5, 8};
        int k = 2;

        // Creating an instance of Solution class and calling sumOfGoodNumbers method
        Solution sol = new Solution();
        int result = sol.sumOfGoodNumbers(nums, k);

        // Displaying the result
        System.out.println("Sum of Good Numbers: " + result);
    }
}

// Given Solution class
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int totalSum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean isGood = true;

            if (i - k >= 0) { 
                if (nums[i] <= nums[i - k]) { 
                    isGood = false;
                }
            }
            if (i + k < n) { 
                if (nums[i] <= nums[i + k]) { 
                    isGood = false;
                }
            }
            if (isGood) {
                totalSum += nums[i];
            }
        }
        return totalSum;
    }
}

