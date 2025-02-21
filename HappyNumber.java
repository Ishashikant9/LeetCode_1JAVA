public class HappyNumber {
    public static void main(String[] args) {
        // Predefined number
        int n = 19;

        // Creating an instance of Solution class and calling isHappy method
        Solution sol = new Solution();
        boolean result = sol.isHappy(n);

        // Displaying the result
        System.out.println(n + " is a Happy Number: " + result);
    }
}

// Given Solution class
class Solution {
    public boolean isHappy(int n) {
        int slow = getNextNumber(n);
        int fast = getNextNumber(getNextNumber(n));

        while (slow != fast) {
            if (fast == 1) return true;
            slow = getNextNumber(slow);
            fast = getNextNumber(getNextNumber(fast));
        }

        return slow == 1;
    }

    private int getNextNumber(int n) {
        int output = 0;
        
        while (n > 0) {
            int digit = n % 10;
            output += digit * digit;
            n = n / 10;
        }
        
        return output;
    }
}
