import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (r > l) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[]{l + 1, r + 1};  // 1-based index
            } else if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
        return new int[]{-1, -1};  // Return -1, -1 if no solution is found
    }
}

public class TwoSumSorted {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example input
        int[] numbers = {2, 7, 11, 15}; 
        int target = 9;
        
        // Calling the function
        int[] result = sol.twoSum(numbers, target);
        
        // Printing the result
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
