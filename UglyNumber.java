public class UglyNumber {
    public static void main(String[] args) {
        // Predefined number
        int n = 30;

        // Creating an instance of Solution class and calling isUgly method
        Solution sol = new Solution();
        boolean result = sol.isUgly(n);

        // Displaying the result
        System.out.println(n + " is an Ugly Number: " + result);
    }
}

// Given Solution class
class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] factors = {2, 3, 5};
        
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        
        return n == 1;
    }
}

