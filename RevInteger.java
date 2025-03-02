public class RevInteger {
    public static void main(String[] args) {
        // Predefined integer
        int num = 12345;

        // Creating an instance of Solution class and calling reverse method
        Solution sol = new Solution();
        int result = sol.reverse(num);

        // Displaying the result
        System.out.println("Reversed integer: " + result);
    }
}

// Given Solution class
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0; // Return 0 if reversing causes overflow
            }
            rev = (rev * 10) + digit;
            x = x / 10;
        }
        return rev;
    }
}
