public class ValidPalin2 {
    public static void main(String[] args) {
        // Predefined string
        String s = "abca";

        // Creating an instance of Solution class and calling validPalindrome method
        Solution sol = new Solution();
        boolean result = sol.validPalindrome(s);

        // Displaying the result
        System.out.println("Can be a palindrome by removing at most one character? " + result);
    }
}

// Given Solution class
class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;
    }

    public boolean isPalindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
