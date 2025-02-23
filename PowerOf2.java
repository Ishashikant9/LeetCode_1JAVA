public class PowerOf2 {
    public static void main(String[] args) {
        // Predefined number
        int n = 16;

        // Creating an instance of Solution class and calling isPowerOfTwo method
        Solution sol = new Solution();
        boolean result = sol.isPowerOfTwo(n);

        // Displaying the result
        System.out.println(n + " is a Power of 2: " + result);
    }
}

// Given Solution class
class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
}
