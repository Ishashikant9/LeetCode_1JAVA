public class BalanceStr {
    public static void main(String[] args) {
        // Predefined numeric string
        String num = "1230";

        // Creating an instance of Solution class and calling isBalanced method
        Solution sol = new Solution();
        boolean result = sol.isBalanced(num);

        // Displaying the result
        System.out.println("Is the string balanced? " + result);
    }
}

// Given Solution class
class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0'; // Convert char to int
            if (i % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }
        return evenSum == oddSum;
    }
}
